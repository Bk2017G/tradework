/**
 * 
 */
package src.com.tradework.webApp;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import src.com.tradework.API.userAPI;

/**
 * @author Anindya Chakraborty
 *
 */
/*
 * Do not change anything in this class
 */

@ApplicationPath("/")
public class MyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register root resource
        classes.add(userAPI.class);
        return classes;
    } 
}
