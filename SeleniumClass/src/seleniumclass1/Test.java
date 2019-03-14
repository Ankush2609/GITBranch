package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test 
{
  public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	  //System.setProperty("webdriver.gecko.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe");
	  //System.setProperty("webdriver.edge.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\MicrosoftWebDriver.exe");
	  //System.setProperty("webdriver.ie.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\IEDriverServer.exe");
	  
	  //webdriver.chrome.driver should be exact same
	  //Build path: Add JAR always add to the Class path not to the module path
	  
	  String path = System.getProperty("webdriver.chrome.driver");
	  //String path = System.getProperty("webdriver.gecko.driver");
	  //String path = System.getProperty("webdriver.edge.driver");
	  //String path = System.getProperty("webdriver.ie.driver");
	  
	  System.out.println(path);
	  
	  WebDriver dr = new ChromeDriver();
	  //WebDriver dr = new FirefoxDriver();
	  //WebDriver dr = new EdgeDriver();
	  //WebDriver dr = new InternetExplorerDriver();
	  
	  //dr.get("https://www.google.co.in");
	  dr.navigate().to("https://www.google.co.in");
	  By by = By.name("q");
	  
	  WebElement googlesearch = dr.findElement(by);
	  googlesearch.sendKeys("Ankush Wasankar");
	  
	  Thread.sleep(2000);
	  dr.manage().window().fullscreen();
	  Thread.sleep(5000);
	  dr.manage().window().maximize();
	  dr.findElement(By.linkText("Gmail")).click();
	  Thread.sleep(2000);
	  dr.navigate().back();
	  Thread.sleep(2000);
	  dr.navigate().forward();
	  Thread.sleep(2000);
	  dr.navigate().refresh();
	  Thread.sleep(5000);
	  //dr.findElement(By.linkText("SIGN IN")).click();
	  System.out.println(dr.getCurrentUrl());
	  System.out.println(dr.getTitle());
	  System.out.println(dr.getWindowHandle());
	  System.out.println(dr.getWindowHandles());
	  dr.quit();
	}
}