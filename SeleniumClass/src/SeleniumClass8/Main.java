package SeleniumClass8;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Testcase tc = new Testcase(driver);
		boolean res = tc.register();
		System.out.println("Result of Register TC "+res);
		
//		boolean loginres = tc.login();
//		System.out.println("Result of Login TC "+loginres);
//		Thread.sleep(5000);
		driver.quit();

	}

}
