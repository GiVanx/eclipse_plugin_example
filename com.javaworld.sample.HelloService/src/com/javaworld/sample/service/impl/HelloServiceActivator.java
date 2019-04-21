package com.javaworld.sample.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.javaworld.sample.service.HelloService;
import com.javaworld.sample.service.HelloServiceFactory;

public class HelloServiceActivator implements BundleActivator {

	ServiceRegistration helloServiceRegistration;
	
	@Override
	public void start(BundleContext arg0) throws Exception {

		HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
		helloServiceRegistration = arg0.registerService(HelloService.class, helloServiceFactory, null);
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		helloServiceRegistration.unregister();
	}

}
