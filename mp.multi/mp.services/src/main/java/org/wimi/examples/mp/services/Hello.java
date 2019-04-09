package org.wimi.examples.mp.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.wimi.examples.mp.interfaces.HelloService;

@Path("hello")
@RequestScoped
public class Hello {

	@Inject
	private HelloService helloService;

	@GET
	@Path("{name}")
	public String hello(@PathParam("name") String name) {
		return helloService.sayHelloTo(name) + "!!";
	}

}