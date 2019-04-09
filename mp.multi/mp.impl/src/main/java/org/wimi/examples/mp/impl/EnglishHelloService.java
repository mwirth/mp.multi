package org.wimi.examples.mp.impl;

import javax.enterprise.context.ApplicationScoped;

import org.wimi.examples.mp.interfaces.HelloService;

@ApplicationScoped
public class EnglishHelloService implements HelloService {

	@Override
	public String sayHelloTo(String name) {
		return ">" + getClass().getName() + "< Hello " + name;
	}

}
