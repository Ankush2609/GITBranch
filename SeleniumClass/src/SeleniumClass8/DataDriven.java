package SeleniumClass8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) {

		//Launching Chrome and navigate to the link
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.freecrm.com/index.html");

		
	}

}
