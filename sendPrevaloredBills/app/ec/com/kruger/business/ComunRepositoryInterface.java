package ec.com.kruger.business;

import java.util.concurrent.CompletionStage;

import com.couchbase.client.java.AsyncBucket;
import com.couchbase.client.java.document.RawJsonDocument;

public interface ComunRepositoryInterface {

public	<T> CompletionStage<T> create(AsyncBucket bucket, RawJsonDocument postData);

}
