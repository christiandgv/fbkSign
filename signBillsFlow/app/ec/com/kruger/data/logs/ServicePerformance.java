package ec.com.kruger.data.logs;

public class ServicePerformance {

	private String operation;
	private String context;
	private Long elapsedTime;
	
	public ServicePerformance(String operation,String context,Long elapsedTime){
		this.operation = operation;
		this.context = context;
		this.elapsedTime = elapsedTime;
	}
	
	public String getContext() {
		return context;
	}
	
	public void setContext(String context) {
		this.context = context;
	}
	
	public Long getElapsedTime() {
		return elapsedTime;
	}
	
	public void setElapsedTime(Long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
}
