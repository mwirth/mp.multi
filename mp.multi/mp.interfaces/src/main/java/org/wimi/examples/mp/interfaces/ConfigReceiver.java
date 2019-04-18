package org.wimi.examples.mp.interfaces;

import java.util.Map;

public interface ConfigReceiver {

	void configurationChanged(Map<String, Object> config);

}