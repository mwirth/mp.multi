package org.wimi.example.mp.config.impl;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.wimi.examples.mp.interfaces.ConfigReceiver;

@ApplicationScoped
public class ConfigReveiverTwo implements ConfigReceiver {

	@Override
	public void configurationChanged(Map<String, Object> config) {
		System.out.println("ConfigReveiverTwo.configurationChanged()");
	}

}
