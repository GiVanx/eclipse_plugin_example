package com.javaworld.sample.service.impl;

import com.javaworld.sample.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		System.out.println("Inside HelloServiceImpl.sayHello()");
		return "say hello";
	}

}
