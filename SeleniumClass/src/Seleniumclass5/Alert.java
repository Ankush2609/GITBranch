package Seleniumclass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
//		dr.navigate().to("https://swapnilkoshti.000webhostapp.com/alert.html");
//		dr.findElement(By.cssSelector("button")).click();
//		System.out.println(dr.switchTo().alert().getText());
//		dr.switchTo().alert().dismiss();
//		dr.findElement(By.cssSelector("button")).click();
//		dr.switchTo().alert().accept();
		
		dr.navigate().to("https://swapnilkoshti.000webhostapp.com/login.html");
		
		dr.switchTo().frame(0);
		
		dr.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Ankush");
		dr.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
		
		dr.switchTo().defaultContent();
		
		dr.switchTo().parentFrame();
		
		dr.switchTo().frame(1);
		
		dr.findElement(By.xpath("//input[@id=\"btn\"]")).click();
		
	}

}
