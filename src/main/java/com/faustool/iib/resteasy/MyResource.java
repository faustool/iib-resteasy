package com.faustool.iib.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBException;

import com.faustool.iib.junit4.POCTest;
import com.faustool.iib.junit4.TestRunner;

@Path("/test")
public class MyResource {
	@GET
	@Produces("application/xml")
	public String runPOCTest() throws JAXBException {
		return new TestRunner().run(POCTest.class);
	}

	@GET
	@Produces("application/xml")
	@Path("{className}")
	public String runClassTest(@PathParam("className") String className) throws JAXBException, ClassNotFoundException {
		return new TestRunner().run(Class.forName(className));
	}

	@GET
	@Produces("application/xml")
	@Path("{className}/{methodName}")
	public String runClassMethodTest(@PathParam("className") String className,
			@PathParam("methodName") String methodName) throws JAXBException, ClassNotFoundException {
		return new TestRunner().run(Class.forName(className), methodName);
	}
}
