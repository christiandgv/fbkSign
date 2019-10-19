package ec.com.kruger;

import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import ec.com.kruger.business.BillingApiControllerImpInterface;
import ec.com.kruger.data.ModelApiResponse;
import ec.com.kruger.data.RequestMessage;
import play.libs.concurrent.HttpExecutionContext;

public class BillingApiHandler {

	
	private final HttpExecutionContext ec;
	private final BillingApiControllerImpInterface billingApiInterface;


	@Inject
	public BillingApiHandler(HttpExecutionContext ec,
			BillingApiControllerImpInterface billingApiInterface) {
		this.ec = ec;
		this.billingApiInterface = billingApiInterface;
	}

	public CompletionStage<ModelApiResponse> newBilling(RequestMessage body) throws Exception {
		return billingApiInterface.newBilling(body).thenApplyAsync(postData -> {
			return postData;
		}, ec.current());

	}

	
	
}
