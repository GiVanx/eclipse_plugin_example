package com.javaworld.sample.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import com.javaworld.sample.service.impl.HelloServiceImpl;

public class HelloServiceFactory implements ServiceFactory {

	private int usageCounter = 0;
	
	@Override
	public Object getService(Bundle arg0, ServiceRegistration arg1) {
		System.out.println("Create object of HelloService for " + arg0.getSymbolicName());
		usageCounter++;
		System.out.println("Number of bundles using service: " + usageCounter);
		HelloService helloService = new HelloServiceImpl();
		return helloService;
	}

	@Override
	public void ungetService(Bundle arg0, ServiceRegistration arg1, Object arg2) {

		System.out.println("Release object of HelloService for " + arg0.getSymbolicName());
		usageCounter--;
		System.out.println("Number of bundles using service: " + usageCounter);
	}

	
}
