package waypoints.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import waypoints.resource.AuthenticationResource;
import waypoints.resource.GetRouteResource;

@ApplicationPath("/")
public class WaypointsApplication extends Application {

	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(GetRouteResource.class);
		s.add(AuthenticationResource.class);
		return s;
	}

}