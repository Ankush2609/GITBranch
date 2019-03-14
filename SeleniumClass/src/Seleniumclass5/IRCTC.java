package Seleniumclass5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		//WebElement el = dr.findElement(By.xpath("//input[@placeholder=\"Journey Date(dd-mm-yyyy)*\"]"));
		
		//el.clear();
		//el.sendKeys("10-10-2018");
		//el.sendKeys(Keys.ESCAPE);
		
		//Old Window
		String currWin = dr.getWindowHandle();
		System.out.println("Current Window: "+dr.getWindowHandle());
		
		//Click to open new window
		dr.findElement(By.cssSelector("label.search_btn")).click();
		
		//All Window
		Set<String> allWins = dr.getWindowHandles();
		System.out.println("All Window: "+dr.getWindowHandles());
		
		for(String str: allWins)		
		{
			if(!str.equals(currWin))
			{
				//Switch'		
				dr.switchTo().window(str);
				String NewWin= dr.getWindowHandle();
				System.out.println("New Window: "+NewWin);
							
				dr.findElement(By.cssSelector("input#inputPnrNo.form-control_custom.input_text_custom")).sendKeys("1234");
				Thread.sleep(2000);
				dr.findElement(By.xpath("//input[@type=\"button\"][@class=\"btn btn-primary btn-md\"][@value=\"Submit\"][@id=\"modal1\"]")).click();
				
				String ExpectedErr 	= "Error! PNR Number should be 10 digit numeric number.";
				String ActualErr 	= dr.findElement(By.xpath("//p[@id=\"errorMessage\"]")).getText();
				
				ActualErr.equals(ExpectedErr);
				System.out.println("TC Passed"+"\n"+" Error displayed: "+ActualErr);
			}
		}	
		dr.close();
		
		//complete close all
		
	}
}