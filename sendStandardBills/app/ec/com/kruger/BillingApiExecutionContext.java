package ec.com.kruger;

import javax.inject.Inject;

import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContextExecutor;
import akka.actor.ActorSystem;

public class BillingApiExecutionContext implements ExecutionContextExecutor {

	private final ExecutionContext executionContext;
	private static final String name = "service.repository";

	@Inject
	public BillingApiExecutionContext(ActorSystem actorSystem) {
		this.executionContext = actorSystem.dispatchers().lookup(name);
	}

	@Override
	public void execute(Runnable runnable) {
		executionContext.execute(runnable);
	}

	@Override
	public void reportFailure(Throwable cause) {
		executionContext.reportFailure(cause);
	}
	
}
