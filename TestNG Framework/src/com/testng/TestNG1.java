package com.testng;

import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestNG1 
{
	private static final Logger logger = LoggerFactory.getLogger(TestNG1.class);

	
	@Test(priority=1,timeOut=1000)
	public void TestNG1m1() throws InterruptedException
	{
		System.out.println("TestNG1m1: M1");
		logger.info("Test");
		Thread.sleep(2000);
	}
	
	@Test(invocationTimeOut=8000)
	public void TestNG1m2() throws InterruptedException
	{
		System.out.println("TestNG1m1: M2");
		Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	public void TestNG1m3() throws InterruptedException
	{
		System.out.println("TestNG1m1: M3");
		Thread.sleep(2000);
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void TestNG1m4() throws InterruptedException
	{
		System.out.println("TestNG1m1: M4");
		Thread.sleep(2000);
		int six = 10/0;
	}
}
