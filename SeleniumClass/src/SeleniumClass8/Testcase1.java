package SeleniumClass8;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 {

	WebDriver driver;
	WebDriverWait wait;
	
	public Testcase1(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
	}
	
	public boolean register() {
		
		Map<String, String> map = new HashMap<>();
		map.put("edition", "Free Edition");
		map.put("firstname", "TestFirstname");
		map.put("lastname", "TestLastName");
		map.put("email", "testmailid@gmail.com");
		map.put("confirmemail", "testmailid@gmail.com");
		map.put("username", "testuser197");
		map.put("password", "testpass1");
		map.put("confirmpassword", "testpass1");
		map.put("companyname", "testcompany1");
		map.put("phone", "1234567890");
		
		
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.
				invisibilityOfElementLocated(By.cssSelector("div#preloader")));
		driver.findElements(By.xpath("//a[@href=\"https://www.freecrm.com/register/\"]"))
		.get(0).click();
		
		new Select(driver.findElement(By.cssSelector("select#payment_plan_id")))
		.selectByVisibleText(map.get("edition"));
		
		driver.findElement(By.name("first_name")).sendKeys(map.get("firstname"));;
		driver.findElement(By.name("surname")).sendKeys(map.get("lastname"));;
		driver.findElement(By.name("email")).sendKeys(map.get("email"));;
		driver.findElement(By.name("email_confirm")).sendKeys(map.get("confirmemail"));;
		driver.findElement(By.name("username")).sendKeys(map.get("username"));;
		driver.findElement(By.name("password")).sendKeys(map.get("password"));;
		driver.findElement(By.name("passwordconfirm")).sendKeys(map.get("confirmpassword"));;
		driver.findElement(By.name("agreeTerms")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("div.myButton")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#company_name")));
		
		driver.findElement(By.cssSelector("input#company_name")).sendKeys(map.get("companyname"));
		driver.findElement(By.cssSelector("input#phone")).sendKeys(map.get("phone"));
		driver.findElement(By.name("copy_address")).click();
		driver.findElement(By.name("btnSubmit")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("finish")));
		driver.findElement(By.name("finish")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.text_orange")));
		
		String msg = driver.findElement(By.cssSelector("div.text_orange")).getText();
		
		if(msg.equals("Your account is now registered.")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public boolean login() {
		Map<String, String> map = new HashMap<>();
		map.put("username", "testuser197");
		map.put("password", "testpass1");
		
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.
				invisibilityOfElementLocated(By.cssSelector("div#preloader")));
		
		driver.findElement(By.name("username")).sendKeys(map.get("username"));
		driver.findElement(By.name("password")).sendKeys(map.get("password"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		if(driver.getCurrentUrl().equals("https://www.freecrm.com/index.html?e=1")) {
			return false;
		}
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']")));
		
//		try {
//			driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']"));
//		} catch (Exception e) {
//			return false;
//		}
		
		return true;
		
	}
	
}
