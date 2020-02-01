package waypoints.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import waypoints.resource.GetRouteResource;

@ApplicationPath("/") 
 public class WaypointsApplication extends Application {
   public Set<Class<?>> getClasses() { return new
     HashSet<Class<?>>(Arrays.asList(GetRouteResource.class)); 
   } 
 }