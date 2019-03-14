package SeleniumClass11;

import org.testng.annotations.Test;

import SeleniumClass8.Testcase;

public class TestNGTestCase2 {
	
	@Test(priority=1)
	public void login() {
		Testcase tc = new Testcase(Config.getDriver());
		tc.login();
	}
	

}
