package com.csg.tau.Backgound;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="feature/Precondition",glue="com.csg.tau.Backgound",monochrome=true)

public class Runner {

}