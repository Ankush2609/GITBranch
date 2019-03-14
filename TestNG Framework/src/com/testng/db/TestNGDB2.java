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

public class TestNGDB2 
{

	@Test
	public void TestNGDB2m1() throws InterruptedException
	{
		System.out.println("TestNGDB2m1: M1");
		Thread.sleep(2000);
	}
	
	@Test
	public void TestNGDB2m2() throws InterruptedException
	{
		System.out.println("TestNGDB2m1: M2");
		Thread.sleep(2000);
	}
	
	@Test
	public void TestNGDB2m3() throws InterruptedException
	{
		System.out.println("TestNGDB2m1: M3");
		Thread.sleep(2000);
	}
	
	@Test
	public void TestNGDB2m4() throws InterruptedException
	{
		System.out.println("TestNGDB2m1: M4");
		Thread.sleep(2000);
	}
	
	@AfterSuite
	public void aftersuitemethod2()
	{
		System.out.println("After Suite: TestNGDB2");
	}
	
	@BeforeSuite
	public void beforesuitemethod2()
	{
		System.out.println("Before Suite: TestNGDB2");
	}
	
	@BeforeTest
	public void beforetestTestNGDB2()
	{
		System.out.println("Before test TestNGDB2");
	}
	
	@AfterTest
	public void aftertestTestNGDB2()
	{
		System.out.println("After test TestNGDB2");
	}
	
	@BeforeMethod
	public void beforemethodTestNGDB2()
	{
		System.out.println("Before Method: TestNGDB2");
	}
	
	@AfterMethod
	public void aftermethodTestNGDB2()
	{
		System.out.println("After Method: TestNGDB2");
	}
	
	@BeforeClass
	public void beforeclassTestNGDB2()
	{
		System.out.println("Before Class: TestNGDB2");
	}
	
	@AfterClass
	public void afterclassTestNGDB2()
	{
		System.out.println("After Class: TestNGDB2");
	}
}
