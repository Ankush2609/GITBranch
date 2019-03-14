

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {

	By preloader = By.cssSelector("div#preloader");
	By username = By.name("username");
	By password = By.name("password");
	By loginbtn = By.xpath("//input[@value='Login']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPO(WebDriver dr) {
		driver = dr;
		wait = new WebDriverWait(driver, 60);
	}
	
	public void login() {
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(username).sendKeys("abc");
		driver.findElement(password).sendKeys("pass1");
		driver.findElement(loginbtn).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
