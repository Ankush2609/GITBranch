package com.csg.tau.Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="feature",glue="com.csg.tau.Cucumber",monochrome=true,
plugin= {"html:HTMLReport","json:JSONReport/cucumber.json","junit:JUNITReport/out.xml"})

public class Runner {

}