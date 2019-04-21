package com.javaworld.sample.HelloWorld;

import com.javaworld.sample.HelloWorld.MyService;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyService {

	MyService service = new MyService();
	
	@Test
	public void testSumCompute() {
		int a = 10;
		int b = 10;
		
		assertEquals(20, service.computeSum(a, b));
	}
}