package com.faustool.iib.resteasy;

import org.jboss.resteasy.plugins.server.tjws.TJWSEmbeddedJaxrsServer;

public class RestService {

	public static void main(String[] args) {
		TJWSEmbeddedJaxrsServer server = new TJWSEmbeddedJaxrsServer();
		server.setPort(8085);
		server.getDeployment().getResources().add(new MyResource());

		server.start();
	}

}
