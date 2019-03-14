package DataDrivenFrameworkAssignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.
		setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumAssignments\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		//Test case: register
		//Test register = new Test(dr);
		//boolean result = register.register();
		//System.out.println("Result of Register TC: "+result);
		//dr.quit();
		
		//Test case: register
		Test login = new Test(dr);
		login.login();
		//Thread.sleep(5000);
		dr.quit();
	}

}
