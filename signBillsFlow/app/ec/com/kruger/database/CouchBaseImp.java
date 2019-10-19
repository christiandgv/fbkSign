package ec.com.kruger.database;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.typesafe.config.Config;

import play.inject.ApplicationLifecycle;

@Singleton
public class CouchBaseImp implements CouchBase {

	Config config;
	Cluster cluster;
	ConcurrentHashMap<String, Bucket> buckets = new ConcurrentHashMap<>();

	@Inject
	public CouchBaseImp(Config config, ApplicationLifecycle lifecycle) {
		this.config = config;
		cluster = CouchbaseCluster.create(config.getString("couchbase.settings.connection.cluster-address"));
		cluster.authenticate(config.getString("couchbase.settings.connection.username"),
				config.getString("couchbase.settings.connection.password"));
		lifecycle.addStopHook(() -> {
			for (Bucket bucket : buckets.values()) {
				bucket.close();
			}
			buckets.clear();
			cluster.disconnect();
			return CompletableFuture.completedFuture(null);
		});
	}

	@Override
	public synchronized Bucket getBucket(String name) {
		Bucket bucket = buckets.get(name);
		if (bucket == null) {
			bucket = cluster.openBucket(name);
			buckets.putIfAbsent(name, bucket);
		}
		return bucket;
	}

	@Override
	public Cluster getCluster() {
		return this.cluster;
	}

}
