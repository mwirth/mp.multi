package org.wimi.examples.mp.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.wimi.examples.mp.interfaces.HelloService;
import org.wimi.examples.mp.interfaces.SayHelloEnglish;
import org.wimi.examples.mp.interfaces.SayHelloGerman;

@Path("hello")
@RequestScoped
public class Hello {

	// @Inject
	// private HelloService helloService;

	@Inject
	@SayHelloGerman
	private HelloService germanHelloService;

	@Inject
	@SayHelloEnglish
	private HelloService englishHelloService;

	@GET
	@Path("{name}")
	public String hello(@PathParam("name") String name) {
		return "simple hello";
	}

	// @GET
	// @Path("sayHello/{name}")
	// public String sayHello(@PathParam("name") String name) {
	// return helloService.sayHelloTo(name);
	// }

	/**
	 * http://localhost:8080/mp.services/data/hello/sayHelloGerman/{name}
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("sayHelloGerman/{name}")
	public String sayHelloGerman(@PathParam("name") String name) {
		return germanHelloService.sayHelloTo(name);
	}

	/**
	 * http://localhost:8080/mp.services/data/hello/sayHelloEnglish/{name}
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("sayHelloEnglish/{name}")
	public String sayHelloEnglish(@PathParam("name") String name) {
		return englishHelloService.sayHelloTo(name);
	}

}