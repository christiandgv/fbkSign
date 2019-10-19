package ec.com.kruger.data.util;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.created;
import static play.mvc.Results.internalServerError;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

import ec.com.kruger.data.ModelApiResponse;
import play.libs.Json;
import play.mvc.Result;

public class ApiResponseCodes {

	public static final String OK = "200";
	public static final String OK_MESSAGE = "Transaccion exitosa";
	public static final String CREATED = "201";
	public static final String CREATED_MESSAGE = "Registro ingresado exitosamente";
	public static final String ERROR = "400";
	public static final String ERROR_MESSAGE = "Ocurrio un error durante la operacion";
	public static final String NOT_FOUND = "404";
	public static final String NOT_FOUND_MESSAGE = "No se encontro registros";
	public static final String FAIL = "500";
	public static final String FAIL_MESSAGE = "No se encontro registros";
	public static final String NO_CREATED = "202";
	public static final String NO_CREATED_MESSAGE = "El registro ya existe";

	public static Result createApiResponse(ModelApiResponse posts) {
		if (posts.getCode() == ApiResponseCodes.NOT_FOUND)
			return notFound(Json.toJson(posts));
		if (posts.getCode() == ApiResponseCodes.ERROR)
			return badRequest(Json.toJson(posts));
		if (posts.getCode() == ApiResponseCodes.CREATED)
			return created(Json.toJson(posts));
		if (posts.getCode() == ApiResponseCodes.FAIL)
			return internalServerError(Json.toJson(posts));

		return ok(Json.toJson(posts));
	}
}
