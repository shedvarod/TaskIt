package taskit.search;

import org.restlet.Restlet;
import org.restlet.Application;
import org.restlet.resource.ServerResource;
import org.restlet.routing.Router;
import org.restlet.routing.Template;

public class TaskItSearch extends Application  {
    @Override
	public synchronized Restlet createInboundRoot() {
		// Create a router Restlet that routes each call to a
		// new instance of HelloWorldResource.
		Router router = new Router(getContext());
		// Defines only one route
		router.attach("/u/{userName}", TaskitSearchResource.class);
		return router;
	}
}


