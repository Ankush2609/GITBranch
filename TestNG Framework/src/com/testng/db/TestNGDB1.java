package com.testng.db;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDB1 
{
	@BeforeSuite
	public void beforesuitemethod1()
	{
		System.out.println("Before Suite: TestNGDB1");
	}
	
	@AfterSuite
	public void aftersuitemethod1()
	{
		System.out.println("After Suite: TestNGDB1");
	}
	
	@BeforeClass
	public void beforeclassTestNGDB1()
	{
		System.out.println("Before Class: TestNGDB1");
	}
	
	@AfterClass
	public void afterclassTestNGDB1()
	{
		System.out.println("After Class: TestNGDB1");
	}
	
	@BeforeTest
	public void beforetestTestNGDB1()
	{
		System.out.println("Before test TestNGDB1");
	}
	
	@AfterTest
	public void aftertestTestNGDB1()
	{
		System.out.println("After test TestNGDB1");
	}
	
	@BeforeMethod
	public void beforemethodTestNGDB1()
	{
		System.out.println("Before Method: TestNGDB1");
	}
	
	@AfterMethod(alwaysRun=true)
	public void aftermethodTestNGDB1()
	{
		System.out.println("After Method: TestNGDB1");
	}
	
	@Test(groups={"FunctionalTest"})
	public void TestNGDB1m1() throws InterruptedException
	{
		System.out.println("TestNGDB1m1: M1");
		Thread.sleep(2000);
	}
	
	@Test(alwaysRun=true)
	public void TestNGDB1m2() throws InterruptedException
	{
		System.out.println("TestNGDB1m1: M2");
		Thread.sleep(2000);
	}
	
	@Test
	public void TestNGDB1m3() throws InterruptedException
	{
		System.out.println("TestNGDB1m1: M3");
		Thread.sleep(2000);
	}
	
	@Test
	public void TestNGDB1m4() throws InterruptedException
	{
		System.out.println("TestNGDB1m1: M4");
		Thread.sleep(2000);
	}
}
