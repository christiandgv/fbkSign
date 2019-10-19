package ec.com.kruger.controller;

import javax.inject.*;

import com.typesafe.config.Config;

import play.mvc.*;

public class ApiDocController extends Controller {

	Config config;

	@Inject
	private ApiDocController(Config config) {
		this.config = config;
	}

	public Result api() {
		String swaggerFile = config.getString("swagger.settings.yaml-file");
		return redirect("/assets/lib/swagger-ui/index.html?/url=/assets/" + swaggerFile);
	}
}