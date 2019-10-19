package ec.com.kruger.business;

import java.util.concurrent.CompletionStage;

import ec.com.kruger.data.Billing;
import ec.com.kruger.data.ModelApiResponse;
import ec.com.kruger.data.RequestMessage;

public interface BillingApiControllerImpInterface {

    CompletionStage<ModelApiResponse> newBilling(RequestMessage body) throws Exception;

}
