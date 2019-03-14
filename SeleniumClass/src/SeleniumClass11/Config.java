package SeleniumClass11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	private static WebDriver driver;
	private static DataProvider dp;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		dp=null;
		try {
			dp = new DataProvider("C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\Data\\CRM.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static DataProvider getDp() {
		return dp;
	}

}
