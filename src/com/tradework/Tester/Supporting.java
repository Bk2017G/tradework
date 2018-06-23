/**
 * 
 */
package com.tradework.Tester;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author super
 *
 */
public class Supporting {
	private HttpServer server;
	private WebTarget target;
	
	@Before
    public void setUp() throws Exception {
//        server = Main.startServer();
// 
        Client c = ClientBuilder.newClient();
//        target = c.target(Main.BASE_URI);
    }
 
    @SuppressWarnings("deprecation")
	@After
    public void tearDown() throws Exception {
        server.stop();
    }
 
    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        String responseMsg = target.path("myresource").request().get(String.class);
        assertEquals("Got it!", responseMsg);
    }
	
}
