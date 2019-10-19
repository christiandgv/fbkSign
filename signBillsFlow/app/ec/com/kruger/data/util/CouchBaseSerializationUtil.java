package ec.com.kruger.data.util;

import java.io.IOException;

import com.couchbase.client.java.document.RawJsonDocument;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;

public class CouchBaseSerializationUtil {

	/**
	 * 
	 * @param documentId
	 * @param data
	 * @return
	 * @throws JsonProcessingException
	 */
	public static RawJsonDocument toCouchBaseRawJsonDocument(String documentId, Object data)
			throws JsonProcessingException {
		String jsonString;
		jsonString = Json.mapper().writeValueAsString(data);
		return RawJsonDocument.create(documentId, jsonString);
	}

	/**
	 * 
	 * @param jsonDocument
	 * @param objectClass
	 * @return
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
	public static <T> T fromCouchBaseRawJsonDocument(RawJsonDocument jsonDocument, Class<T> objectClass)
			throws JsonProcessingException, IOException {
		JsonNode inputDocument;
		inputDocument = Json.mapper().readTree(jsonDocument.content());
		return Json.mapper().treeToValue(inputDocument, objectClass);

	}

	public static RawJsonDocument toCouchBaseRawJsonDocument(String documentId, Object data, long cas)
			throws JsonProcessingException {
		String jsonString;
		jsonString = Json.mapper().writeValueAsString(data);
		return RawJsonDocument.create(documentId, jsonString, cas);
	}
}
