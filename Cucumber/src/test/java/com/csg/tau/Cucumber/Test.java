package com.csg.tau.Cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test 
{
	
	@Given("^Username as \"([^\"]*)\" & Password as \"([^\"]*)\"$")
	public void Credentails(String username, String Password) {
		System.out.println("Username as "+username +" & Password as "+Password);
	}
	
	@When("User Enters Username & password")
	public void EnterCredentails() {
		System.out.println("User Enters Username & password");
	}
	
	@And("^Click on \"([^\"]*)\" button$")
	public void ClickLogin(String button) {
		System.out.println("Click on "+button+" button");
	}
	
	@But("Not click reset button")
	public void ClickNotReset() {
		System.out.println("Not click reset button");
	}
	
	@Then("Login should be successful")
	public void LoginSuccessful() {
		System.out.println("Login should be successful");
	}
	
	@Then("add items to cart")
	public void add_to_cart(DataTable table) throws Throwable {
	    //System.out.println(table);
	    List<List<String>> items = table.asLists(String.class);
	    System.out.println(items.get(0).get(1));
	    List<Map<String, String>> itemap = table.asMaps(String.class, String.class);
	    System.out.println(itemap.get(1).get("Brand"));
	}
}
