package org.wimi.examples.mp.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

	@GET
	public String ping() {
		return "Hello Multiproject JavaEE 8!";
	}

}