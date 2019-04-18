package org.wimi.example.mp.impl;

import javax.enterprise.context.ApplicationScoped;

import org.wimi.examples.mp.interfaces.HelloService;
import org.wimi.examples.mp.interfaces.SayHelloEnglish;

@ApplicationScoped
@SayHelloEnglish
public class EnglishHelloService implements HelloService {

	@Override
	public String sayHelloTo(String name) {
		return ">" + getClass().getName() + "< Hello " + name;
	}

}
