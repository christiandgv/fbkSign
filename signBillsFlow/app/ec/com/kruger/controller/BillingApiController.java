package ec.com.kruger.controller;

import java.util.concurrent.CompletionStage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

import ec.com.kruger.BillingApiHandler;
import ec.com.kruger.data.Billing;
import ec.com.kruger.data.RequestMessage;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-02-15T20:13:26.758Z")

public class BillingApiController extends Controller {
	
	
	private final ObjectMapper mapper;
	private HttpExecutionContext ec;
	private BillingApiHandler billingApiHandler;

	@Inject
	private BillingApiController(BillingApiHandler handler, HttpExecutionContext ec) {
		this.ec = ec;
		this.billingApiHandler = handler;
		this.mapper = new ObjectMapper();
	}
    
	
	@ApiAction
	public CompletionStage<Result> newBilling() throws Exception {
		JsonNode nodebody = request().body().asJson();
		RequestMessage body= new RequestMessage();
		body = Json.fromJson(nodebody, RequestMessage.class);
		
		return billingApiHandler.newBilling(body).thenApplyAsync(posts -> {
			return ok(Json.toJson(posts));
		} , ec.current());
	}
	

        

}
