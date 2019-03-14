import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage_PF {
	
	@FindBy(css="div#preloader")
	WebElement preloader;
	
	@FindBy(how=How.NAME,using="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	

	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage_PF(WebDriver dr) {
		driver = dr;
		wait = new WebDriverWait(driver, 60);
	}
	
	public void login() {
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.invisibilityOf(preloader));
		username.sendKeys("abc");
		password.sendKeys("pass1");
		login.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
