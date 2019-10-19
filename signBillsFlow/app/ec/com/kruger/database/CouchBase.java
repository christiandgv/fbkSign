package ec.com.kruger.database;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;

public interface CouchBase {
	public Cluster getCluster();

	public Bucket getBucket(String name);
}
