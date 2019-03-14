package com.csg.tau.Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import po.freeCRMPO;

public class LaunchApplication {

	public static WebDriver driver;
	  
	public static void main(String args[]) throws IOException {
		System.out.println("Constru1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		freeCRMPO freeCRMPO = new freeCRMPO(driver);
		freeCRMPO.lanchapp();
		freeCRMPO.signup();
	}
}
