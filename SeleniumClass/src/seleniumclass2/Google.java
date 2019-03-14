package seleniumclass2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.google.co.in/");
		
		List<WebElement> list = dr.findElements(By.tagName("a"));
		//dr.findElements(By.cssSelector("a.gb_P")).get(0).click();
		//dr.navigate().back();
		
		//By single id or class for css selector
//		List<WebElement> list1 = dr.findElements(By.cssSelector("input.gsfi"));
//		System.out.println(list1.size());
//		list1.get(0).sendKeys("India");
//		Thread.sleep(5000);
		
		//By both
		//dr.findElement(By.cssSelector("input#lst-ib.gsfi")).sendKeys("INDIA");
		//Thread.sleep(2000);
		
		//By providing additional attributes
		dr.findElement(By.cssSelector("a.gb_P[data-pid='23']")).click();
		Thread.sleep(50000);
		
//		System.out.println(list.size());
//		
//		for(int i=0; i<list.size();i++)
//		{	
//			System.out.println(list.get(i).getAttribute("href"));
//		}
		dr.quit();

	}

}
