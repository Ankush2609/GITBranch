package SeleniumClass8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase {

	WebDriver driver;
	WebDriverWait wait;
	
	public Testcase(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
	}
	
	public boolean register() throws IOException {
		
		Map<String, String> map = new HashMap<>();		
		map.put("Edition", "Free Edition");
		map.put("Firstname", "Name1");
		map.put("Lastname", "SurName1");
		map.put("Email", "FirstSurName1@gmail.com");
		map.put("Confirmemail", "FirstSurName1@gmail.com");
		map.put("username", "FirstSurName1");
		map.put("Password", "password1");
		map.put("Confirmpassword", "password1");
		
		FileInputStream xlfile = new FileInputStream("C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\Data\\CRM.xlsx");
		Workbook wb = new XSSFWorkbook(xlfile);
		XSSFSheet CRM = (XSSFSheet) wb.getSheetAt(0);
		
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.
				invisibilityOfElementLocated(By.cssSelector("div#preloader")));
		driver.findElements(By.xpath("//a[@href=\"https://www.freecrm.com/register/\"]"))
		.get(0).click();
		
		new Select(driver.findElement(By.cssSelector("select#payment_plan_id")))
		.selectByVisibleText(map.get("Edition"));
		
		driver.findElement(By.name("first_name")).sendKeys(map.get("Firstname"));
		driver.findElement(By.name("surname")).sendKeys(map.get("Lastname"));
		driver.findElement(By.name("email")).sendKeys(map.get("Email"));
		driver.findElement(By.name("email_confirm")).sendKeys(map.get("Confirmemail"));
		driver.findElement(By.name("username")).sendKeys(map.get("username"));
		driver.findElement(By.name("password")).sendKeys(map.get("Password"));
		driver.findElement(By.name("passwordconfirm")).sendKeys(map.get("Confirmpassword"));
		driver.findElement(By.name("agreeTerms")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("div.myButton")).click();
		
		ExpectedCondition<Alert> alert = ExpectedConditions.alertIsPresent();
		
		if(alert!=null) {
			driver.switchTo().alert().accept();
			return false;
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#company_name")));
		
		driver.findElement(By.cssSelector("input#company_name")).sendKeys("TestCompany");
		driver.findElement(By.cssSelector("input#phone")).sendKeys("1234567890");
		driver.findElement(By.name("copy_address")).click();
		driver.findElement(By.name("btnSubmit")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnSubmit")));
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
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.
				invisibilityOfElementLocated(By.cssSelector("div#preloader")));
		
		driver.findElement(By.name("username")).sendKeys("FirstSurName1");
		driver.findElement(By.name("password")).sendKeys("password1");
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
