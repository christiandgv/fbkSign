package ec.com.kruger.data.util;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ec.com.kruger.data.ModelApiResponse;

public class UtilitaryClass {

	public static JsonNode textToJsonNode(String content) {
		ObjectMapper mapper = new ObjectMapper();
		com.fasterxml.jackson.databind.JsonNode jsonNode = null;
		try {
			jsonNode = mapper.readTree((content == null) ? "{}" : content);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return jsonNode;
	}

	
	public static ModelApiResponse correct(JsonNode json, String codigo, String text) {
		System.out.println("JSON --> " + json);
		ModelApiResponse response = new ModelApiResponse();
		response.setData(json == null ? textToJsonNode("{}") : json);
		response.setCode(codigo == null ? ApiResponseCodes.OK : codigo);
		response.setMessage(text);
		// System.out.println(response.toString() + text);
		return response;
	}

	public static ModelApiResponse error(JsonNode json, String codigo, String text) {
		ModelApiResponse response = new ModelApiResponse();
		response.setData(json == null ? textToJsonNode("{}") : json);
		response.setCode(codigo == null ? ApiResponseCodes.ERROR : codigo);
		response.setMessage(text);
		System.out.println(response.toString());
		return response;
	}

	

}
