package com.csg.tau.Backgound;
import cucumber.api.java.en.Given;

public class Test 
{
	@Given("Test")
	public void test() throws Throwable 
	{
		System.out.println("Background");
	}
	
	@Given("Test1")
	public void test1() throws Throwable 
	{
		System.out.println("Test1");
	}
	
	@Given("Test2")
	public void test2() throws Throwable 
	{
		System.out.println("Test2");
	}
	
	@Given("Test3")
	public void test3() throws Throwable 
	{
		System.out.println("Test3");
	}
}
