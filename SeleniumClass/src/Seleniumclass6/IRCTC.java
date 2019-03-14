package Seleniumclass6;

import java.util.Set;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.irctc.co.in/nget/train-search");

		Stack<String> stack = new Stack<>();
			
		stack.push(dr.getWindowHandle());
		dr.findElement(By.cssSelector("label.search_btn")).click();
		
		String newwin = getNewWindow(stack, dr.getWindowHandles());
		
		dr.switchTo().window(newwin);
		dr.get("https://www.irctc.co.in/nget/");
		
		stack.push(dr.getWindowHandle());
		dr.findElement(By.cssSelector("label.search_btn")).click();
		
		newwin = getNewWindow(stack, dr.getWindowHandles());
		dr.switchTo().window(newwin);
		
		dr.findElement(By.cssSelector("input#inputPnrNo")).sendKeys("2015");
		Thread.sleep(3000);
		dr.close();
		
		dr.switchTo().window(stack.pop());
		dr.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Pune");
		Thread.sleep(3000);
		dr.close();
		
		dr.switchTo().window(stack.pop());
		dr.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Pune");
		Thread.sleep(3000);
		dr.close();
		
		Thread.sleep(5000);
		dr.quit();
	}
	
	public static String getNewWindow(Stack<String> stack,Set<String> set) {
		for(String str : set) {
			if(!stack.contains(str))
				return str;
		}	
		return "";
	}
}