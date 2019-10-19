package ec.com.kruger.business;

import java.util.concurrent.CompletionStage;

import ec.com.kruger.data.Billing;
import ec.com.kruger.data.ModelApiResponse;

public interface BillingApiControllerImpInterface {

    CompletionStage<ModelApiResponse> newBilling(Billing body) throws Exception;

}
