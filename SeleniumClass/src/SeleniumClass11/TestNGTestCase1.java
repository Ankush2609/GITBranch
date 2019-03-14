package SeleniumClass11;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import SeleniumClass8.Testcase;

public class TestNGTestCase1 {
	
	@BeforeSuite
	public void init() {
		Config.init();
	}
	
	@AfterSuite
	public void destroy() {
		Config.getDriver().quit();
	}
	
	@Test(priority=0)
	public void reg() throws IOException {
		Testcase tc = new Testcase(Config.getDriver());
		tc.register();
	}
	
	
	
}
