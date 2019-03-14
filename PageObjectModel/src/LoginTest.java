import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankus\\eclipse-workspace\\SeleniumAssignments\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		LoginPage login = new LoginPage(driver);
//		login.login();
		
		LoginPage_PF pf = new LoginPage_PF(driver);
		
		PageFactory.initElements(driver, pf);
		
		pf.login();
		driver.quit();
	}

	}