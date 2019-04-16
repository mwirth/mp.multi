package org.wimi.examples.mp.impl;

import javax.enterprise.context.ApplicationScoped;

import org.wimi.examples.mp.interfaces.HelloService;
import org.wimi.examples.mp.interfaces.SayHelloGerman;

@ApplicationScoped
@SayHelloGerman
public class GermanHelloService implements HelloService {

	@Override
	public String sayHelloTo(String name) {
		return ">" + getClass().getName() + "< Hallo " + name;
	}

}
