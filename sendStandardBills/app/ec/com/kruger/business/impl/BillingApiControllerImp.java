package ec.com.kruger.business.impl;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.ArrayList;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.couchbase.client.java.Bucket;
import com.fasterxml.jackson.databind.JsonNode;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import ec.com.kruger.BillingApiExecutionContext;
import ec.com.kruger.business.BillingApiControllerImpInterface;
import ec.com.kruger.data.Billing;
import ec.com.kruger.data.ModelApiResponse;
import ec.com.kruger.data.ResponseMessage;
import ec.com.kruger.data.util.ApiResponseCodes;
import ec.com.kruger.data.util.UtilitaryClass;
import ec.com.kruger.database.CouchBase;
import https.siat_impuestos_gob.RecepcionErrorDetalleDto;
import https.siat_impuestos_gob.Respuesta;
import https.siat_impuestos_gob.SolicitudRecepcion;
import https.siat_impuestos_gob_bo.facturaelectronicaestandar.ServicioFacturacionService;
import play.libs.Json;
import views.html.defaultpages.error;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-02-15T20:13:26.758Z")
public class BillingApiControllerImp implements	
		BillingApiControllerImpInterface {
	
	private static Logger log = LoggerFactory.getLogger(BillingApiControllerImp.class.getSimpleName());
	public static String SYSTEM_CODE = ConfigFactory.load().getString("system.code");
	private final BillingApiExecutionContext ec;
	public static int ENVIRONMENT_CODE = ConfigFactory.load().getInt("environment.code");

	
	private Bucket bucketOrder;
	@SuppressWarnings("unused")
	private CouchBase base;
	
	@Inject
	public BillingApiControllerImp(BillingApiExecutionContext ec, CouchBase base, Config config) {
		this.ec = ec;
		this.base = base;
		bucketOrder = base.getBucket(ConfigFactory.load().getString("bucket.cdb"));
	}
	

	@Override
	public CompletionStage<ModelApiResponse> newBilling(Billing body)
			throws Exception {
		return supplyAsync(() -> sendStandardBilling(body), ec);
	}

	
	/**
	 * @param body
	 * @return ModelApiResponse
	 */
	private ModelApiResponse sendStandardBilling(Billing body) {
		ModelApiResponse response = new ModelApiResponse();
				try {
					    try {
					    	ServicioFacturacionService service =new ServicioFacturacionService();
						    	int responseVerify = service.getServicioFacturacionPort().verificarComunicacion();
						    	if (UtilitaryClass.isConnectionVerify(responseVerify)) {
						    		SolicitudRecepcion requestStandardBilling =  new SolicitudRecepcion();
						    		requestStandardBilling = makeObjectParams(body);
						    		Respuesta responseService = service.getServicioFacturacionPort().recepcionFacturaElectronicaEstandar(requestStandardBilling);
						    		
						    		ResponseMessage responseModel = new ResponseMessage();
						    		responseModel.setReceptionCode(responseService.getCodigoRecepcion());
						    		responseModel.setStatusCode(responseService.getCodigoEstado());
						    		responseModel.setResponseCodes(responseService.getListaCodigosRespuestas());
						    		
						    		JsonNode resServiceRest = Json.mapper().valueToTree(responseModel);
						    		response = UtilitaryClass.correct(resServiceRest, ApiResponseCodes.OK, ApiResponseCodes.OK_MESSAGE);
						    	}
						    	else {
						    		log.error("Service Not responding, mark billing in offline mode");
						    	}
						    	
						    } catch (Exception e) {
						    	log.error("error personalized:",error.toString());
						    	e.printStackTrace();
					}						
				} catch (Exception e) {
					JsonNode errorNode = Json.mapper().valueToTree(e);
					e.printStackTrace();
					return UtilitaryClass.error(errorNode, ApiResponseCodes.ERROR, ApiResponseCodes.ERROR_MESSAGE);
				}
		return response;
	}
    
		
	/**
	 * Make request object 
	 * @param body
	 * @return SolicitudRecepcion object
	 * @throws DatatypeConfigurationException
	 */
	private SolicitudRecepcion makeObjectParams(Billing body) throws DatatypeConfigurationException {
		SolicitudRecepcion response = new SolicitudRecepcion();
		response.setArchivo(body.getPayload());
		response.setCodigoAmbiente(ENVIRONMENT_CODE);
		response.setCodigoDocumentoFiscal(body.getFiscalDocumentCode());
		response.setCodigoDocumentoSector(body.getSectorCode());
		response.setCodigoEmision(body.getEmissionCode());
		response.setCodigoModalidad(body.getModalityCode());
		response.setCodigoSistema(SYSTEM_CODE);
		response.setCodigoSucursal(body.getBranchOfficeCode()!=null ? body.getBranchOfficeCode() : 0);
		response.setCufd(body.getCufd());
		response.setCuis(body.getCuis());
		response.setFechaEnvio(UtilitaryClass.getTimeUTC());
		response.setHashArchivo(body.getHashFile());
		response.setNit(body.getNit());
		return response;
	}
	
	
   	
}
