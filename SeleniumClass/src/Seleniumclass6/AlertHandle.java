package Seleniumclass6;

import java.lang.System.Logger;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
			
		//dr.navigate().to("https://swapnilkoshti.000webhostapp.com/expwait.html");
		
		//Exception in thread "main" org.openqa.selenium.ElementNotVisibleException: element not interactable
		dr.navigate().to("https://swapnilkoshti.000webhostapp.com/newexpwait.html");
		
		//Implicit wait
		//Exception in thread "main" org.openqa.selenium.ElementNotVisibleException: element not interactable
		dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(dr, 60);
		
		//Fluent Wait
		FluentWait<WebDriver> Wait = new FluentWait<WebDriver>(dr)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		
		WebElement el = dr.findElement(By.xpath("//input[@id=\"btn\"]"));
		
		Wait.until(ExpectedConditions.visibilityOf(el));
		//wait.until(ExpectedConditions.tx);
		
		el.click();
		
		//Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert
		Wait.until(ExpectedConditions.alertIsPresent());
		
		//dr.findElement(By.xpath("//input[@id=\"btn\"]")).click();
		dr.switchTo().alert().accept();
		dr.quit();
	}

}
