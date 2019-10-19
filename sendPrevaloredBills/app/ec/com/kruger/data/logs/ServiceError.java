package ec.com.kruger.data.logs;

public class ServiceError {

	private String errorMessage;
	
	public ServiceError(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
}
