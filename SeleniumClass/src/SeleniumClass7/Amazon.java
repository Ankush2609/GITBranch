package SeleniumClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching Chrome and navigate to the link
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.amazon.in/");
		
		WebElement elmenu = dr.findElement(By.xpath("//a[@class=\"nav-a nav-a-2\"][@data-nav-role=\"signin\"]"));
		WebElement elink = dr.findElement(By.xpath("//span[text()=\"Your Account\"]"));
		
		Actions act =  new Actions(dr);
		Action a  = act.moveToElement(elmenu).click(elink).build();
		a.perform();
		
		Thread.sleep(5000);
		
	}

}
