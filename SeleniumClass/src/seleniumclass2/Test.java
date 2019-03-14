package seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//dr.navigate().to("https://www.facebook.com/");
		//dr.findElement(By.id("email")).sendKeys("ankushwasankar26@gmail.com");
		dr.navigate().to("https://www.google.co.in/");
		dr.findElement(By.className("gsfi")).sendKeys("Ankush Wasankar");
		Thread.sleep(2000);
		dr.findElement(By.className("gsfi")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		dr.findElement(By.name("btnK")).click();
		//dr.quit();
	}
	
}