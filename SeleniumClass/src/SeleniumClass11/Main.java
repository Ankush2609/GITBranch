package SeleniumClass11;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumClass8.Testcase;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		
		try {
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		WebDriver driver = new ChromeDriver();
		Testcase tc = new Testcase(driver);
		boolean res = tc.register();
		System.out.println("Result of Register TC "+res);
		
		boolean loginres = tc.login();
		System.out.println("Result of Login TC "+loginres);
		Thread.sleep(5000);
		driver.quit();


	}

}
