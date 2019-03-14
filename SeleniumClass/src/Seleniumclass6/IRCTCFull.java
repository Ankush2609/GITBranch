package Seleniumclass6;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCFull {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.irctc.co.in/nget/train-search");
		dr.findElement(By.xpath("//input[@placeholder=\"From*\"]")).sendKeys("BADNERA JN - BD");
		dr.findElement(By.xpath("//input[@placeholder=\"To*\"]")).sendKeys("PUNE JN - PUNE");
		dr.findElement(By.xpath("//input[@placeholder=\"Journey Date(dd-mm-yyyy)*\"]")).clear();
		dr.findElement(By.xpath("//input[@placeholder=\"Journey Date(dd-mm-yyyy)*\"]")).sendKeys("16-10-2018");
		dr.findElement(By.xpath("//input[@placeholder=\"Journey Date(dd-mm-yyyy)*\"]")).sendKeys(Keys.ESCAPE);
		dr.findElement(By.xpath("//label[@class=\"ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]")).click();
		dr.findElement(By.xpath("//button[@label=\"Find Trains\"]")).click();
		

	}

}
