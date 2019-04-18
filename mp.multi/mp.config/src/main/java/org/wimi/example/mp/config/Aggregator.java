package org.wimi.example.mp.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.wimi.examples.mp.interfaces.ConfigReceiver;
import org.wimi.examples.mp.interfaces.HelloService;

@Path("aggregate")
@RequestScoped
public class Aggregator {

	@Inject
	private Instance<HelloService> helloServices;

	@Inject
	private Instance<ConfigReceiver> configReceivers;

	@PostConstruct
	private void postConstruct() {
		System.out.println("post construct");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("pre destroy");
	}

	// @GET
	// @Path("{name}")
	// public String hello(@PathParam("name") String name) {
	// return "Hello to " + name + " from aggreate!";
	// }

	/**
	 * http://localhost:8080/mp.services/data/aggregate/configreceivers
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("configreceivers")
	public String configreceivers() {
		StringBuilder sb = new StringBuilder();
		for(ConfigReceiver config : configReceivers) {
			sb.append(config + "\n");
		}
		return "registerd configReceivers: '" + sb + "'";
	}

	/**
	 * http://localhost:8080/mp.services/data/aggregate/ping
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("ping")
	public String ping() {
		StringBuilder sb = new StringBuilder();
		for(ConfigReceiver config : configReceivers) {
			config.configurationChanged(null);
		}
		return "registerd configReceivers: '" + sb + "'";
	}

	/**
	 * http://localhost:8080/mp.services/data/aggregate/hellos
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("hellos")
	public String hellos() {
		StringBuilder sb = new StringBuilder();
		for(HelloService hello : helloServices) {
			sb.append(hello + "\n");
		}
		return "registerd hellos: '" + sb + "'";
	}

	/**
	 * http://localhost:8080/mp.services/data/aggregate/print
	 *
	 * @param name
	 * @return
	 */
	@GET
	@Path("print")
	public String print() {
		for(ConfigReceiver config : configReceivers) {
			System.out.println(config);
		}
		return "fertisch!";
	}

}