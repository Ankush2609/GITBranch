package seleniumclass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAAutomationForm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://toolsqa.com/automation-practice-form/");
		dr.findElement(By.name("firstname")).sendKeys("Ankush");
		dr.findElement(By.name("lastname")).sendKeys("Wasankar");
		//dr.findElement(By.id("sex-0")).click();
		dr.findElement(By.name("sex")).click();
		
		List<WebElement> list = dr.findElements(By.name("exp"));
		list.get(5).click();
		
		//dr.findElement(By.id("exp-5")).click();
		dr.findElement(By.id("datepicker")).sendKeys("30/09/2018");
		
		if(!dr.findElement(By.id("profession-1")).isSelected())
		{
			dr.findElement(By.id("profession-1")).click();
		}
		
		//isMultiple: To select multiple value
		WebElement el = dr.findElement(By.name("selenium_commands"));
		Select select = new Select(el);
		
		if(select.isMultiple())
		{
			select.selectByVisibleText("Browser Commands");
			select.selectByIndex(4);
			Thread.sleep(5000);
		}
		dr.quit();			
	}
}