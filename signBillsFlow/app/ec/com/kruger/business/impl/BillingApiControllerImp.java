package ec.com.kruger.business.impl;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.RawJsonDocument;
import com.fasterxml.jackson.databind.JsonNode;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import ec.com.kruger.BillingApiExecutionContext;
import ec.com.kruger.business.BillingApiControllerImpInterface;
import ec.com.kruger.data.Billing;
import ec.com.kruger.data.Catalog;
import ec.com.kruger.data.ModelApiResponse;
import ec.com.kruger.data.RequestMessage;
import ec.com.kruger.data.util.ApiResponseCodes;
import ec.com.kruger.data.util.CouchBaseSerializationUtil;
import ec.com.kruger.data.util.UtilitaryClass;
import ec.com.kruger.database.CouchBase;
import krugercorp.ec.com.sign.Firmador;
import play.libs.Json;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-02-15T20:13:26.758Z")
public class BillingApiControllerImp implements	
		BillingApiControllerImpInterface {

	public static Logger log = LoggerFactory.getLogger(BillingApiControllerImp.class.getSimpleName());


	private final BillingApiExecutionContext ec;
	private Bucket bucketOrder;
	@SuppressWarnings("unused")
	private CouchBase base;
	
	private static String HASH_TYPE = "SHA-256";
	
	
	@Inject
	public BillingApiControllerImp(BillingApiExecutionContext ec, CouchBase base, Config config) {
		this.ec = ec;
		this.base = base;
		bucketOrder = base.getBucket(ConfigFactory.load().getString("bucket.cdb"));
	}
	

	@Override
	public CompletionStage<ModelApiResponse> newBilling(RequestMessage body)
			throws Exception {
		// Do your magic!!!
		return supplyAsync(() -> new_Billing(body), ec);
	}

	
	private ModelApiResponse new_Billing(RequestMessage body) {
		ModelApiResponse response = new ModelApiResponse();
				
				RawJsonDocument itemDocument = bucketOrder.get(body.getUuid(), RawJsonDocument.class);
				try {
					Billing billing = CouchBaseSerializationUtil.fromCouchBaseRawJsonDocument(itemDocument, Billing.class);
						response = UtilitaryClass.correct(Json.mapper().valueToTree(itemDocument.content()), ApiResponseCodes.CREATED, ApiResponseCodes.CREATED_MESSAGE);
						byte[] xml = Base64.decodeBase64(billing.getPayload());
						    try {
						    	Catalog catalog = getCredentials(billing.getNit());
						    	String key = catalog.getAux1();
						    	String cert = catalog.getAux2();
						    	//String key = "LS0tLS1CRUdJTiBQUklWQVRFIEtFWS0tLS0tCk1JSUNkd0lCQURBTkJna3Foa2lHOXcwQkFRRUZBQVNDQW1Fd2dnSmRBZ0VBQW9HQkFMQnliMGx3QXh4VHcxZSsKTTZ5YnRZVW51SkczMEk5dlk1ckV1ajhuWjhPcUpEMVBoZmVTS0RQMHZrS1JEdG1LTnR2RllSMHFueUhCLzNmTAprS1o2emkrZElCdHNxOXlqbHVrNWhqTmJiZHdUSTVqMjAraXhnKzl3TU1taFpiczlHR0FuSml6NlBJME1tNU1FCnNqQy9MYzNHS051Mm8vOU4wKy9CTjZ3MXU4WERBZ01CQUFFQ2dZQm11R2dUUDdOLzVUKytzQXNUUEo3alF1bVAKWTR4MlJHbWZLMUlsL0FITGhoeU0yT1ByNmRtZnphYUp5RHIxNkNIaHRibkFxaFIwS2FWWkQxaEpvd3F1ODczcwpaL2VJVDdiRHN6cFdla0pBOXNGOXhYMGlPQjJ3eng3SlBnWDFzd1MrdlRROVhGcHlQVWJpaXcwM0lZbmFSalVVCkZMTG5CdFdlZTJFYmgyc1BVUUpCQU40YVMzM3pJL1l6eXQ1clplSSt5WG8zbURoVkl4endMQWh5bmlhZktTaTIKUDl5YWZycGI3RUprK0VvNTRBcjV4QWNEZEUzNXFobmdjUDdqS1JMMzhDc0NRUURMWUZjWWtqZnlsNEdSUW10ZgpLSVFCdTZleXVnL1E4K3dkY3BueDJvVlRDeHVuc1FzOHJadjdGanNQWkNNNE80M280clRTVlBJRzJaNjBZRjUvCklwekpBa0VBait0VURjcFcvRHUxY29qL1hTcTRYYlRXczNJZnJhbkhycld1MjNINU5zTmFBSFl3Tmt4SWZRRjIKam9xUUxpeUlwTTdOTjVYWGJxc3NMVTQvbUdZSFB3SkFkNlJUV0hjY1JyQnVYcC91UG1xOVRhK3hkZWtUU045VwpOZlNuTDZwWDZJU09YbFkrd0JGNXczcE9nRDF1b3JRV1JieW9sMXUxamVZVUFSVDRRbDZBVVFKQkFJaHRJOU9jCnQvTXRSdTQvQi9IMmRJWFpRMVkxVWpjU1dnckhEZ3pKT29tK2tyVWEyT0Fzc0RWQnV0QUJjRWJWb1JkUlRzaGMKcmpXTnBYcWZDQUtjUFI0PQotLS0tLUVORCBQUklWQVRFIEtFWS0tLS0t";
						    	PrivateKey privateKey = Firmador.getPrivateKeyFromBase64(key);
						    	X509Certificate certificate = Firmador.get509CertFromBase64(cert);
						    	
						        byte[] xmlSigned = Firmador.firmarDsig(xml, privateKey, certificate);
						        byte[] encode = Base64.encodeBase64(xmlSigned);
					        	String hash = Firmador.getInstance().algoritmoHash(encode, HASH_TYPE);
					        	
						    } catch (Exception e) {
						    	e.printStackTrace();
					}
						
				} catch (Exception e) {
					JsonNode errorNode = Json.mapper().valueToTree(e);
					e.printStackTrace();
					return UtilitaryClass.error(errorNode, ApiResponseCodes.ERROR, ApiResponseCodes.ERROR_MESSAGE);
				}

				
		return response;
	}
    
	
	
	private Catalog getCredentials(Long nit) {
		RawJsonDocument itemDocument = bucketOrder.get(ConfigFactory.load().getString("prefix.catalog") + "credentials" +":client:"+ nit, RawJsonDocument.class);
		Catalog catalog = new Catalog();
		try {
			catalog = CouchBaseSerializationUtil.fromCouchBaseRawJsonDocument(itemDocument, Catalog.class);
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return catalog;
		  
		
	}
	
   	
}
