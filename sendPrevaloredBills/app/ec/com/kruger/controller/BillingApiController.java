package ec.com.kruger.controller;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;

import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Source;
import akka.util.ByteString;
import ec.com.kruger.BillingApiHandler;
import ec.com.kruger.MyExecutionContext;
import ec.com.kruger.data.Billing;
import play.api.mvc.ResponseHeader;
import play.libs.Json;
import play.libs.concurrent.HttpExecution;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import swagger.SwaggerUtils.ApiAction;
import static java.util.concurrent.CompletableFuture.supplyAsync;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-02-15T20:13:26.758Z")

public class BillingApiController extends Controller {
	
	
	private HttpExecutionContext ec;
	private BillingApiHandler billingApiHandler;
	

	@Inject
	private BillingApiController(BillingApiHandler handler, HttpExecutionContext ec) {
		this.ec = ec;
		this.billingApiHandler = handler;
	}
    
	
	@ApiAction
	public CompletionStage<Result> newBilling() throws Exception {
		JsonNode nodebody = request().body().asJson();
		Billing body= new Billing();
		body = Json.fromJson(nodebody, Billing.class);
		
		return billingApiHandler.newBilling(body).thenApplyAsync(posts -> {
			return ok(Json.toJson(posts));
		} , ec.current());
	}
	

   	
	 /*public CompletionStage<Result> newBillingStream() {
		    // Wrap an existing thread pool, using the context from the current thread
		    Executor myEc = HttpExecution.fromThread((Executor) myExecutionContext);
		    return supplyAsync(() -> intensiveComputation(), myEc)
		        .thenApplyAsync(i -> ok("Got result: " + i), myEc);
		  }

		  public int intensiveComputation() {
		    return 2;
		  
		  }
		  
		  */
}
