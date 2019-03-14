package seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://newtours.demoaut.com//");
		dr.findElement(By.linkText("REGISTER")).click();
		//dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		dr.findElement(By.name("firstName")).sendKeys("Ankush");
		dr.findElement(By.name("lastName")).sendKeys("Wasankar");
		dr.findElement(By.name("phone")).sendKeys("9579225290");
		dr.findElement(By.id("userName")).sendKeys("ankushwasankar@gmail.com");
		dr.findElement(By.name("address1")).sendKeys("Kaspate wasti");
		dr.findElement(By.name("address2")).sendKeys("Wakad");
		dr.findElement(By.name("city")).sendKeys("Pune");
		dr.findElement(By.name("state")).sendKeys("Maharashtra");
		dr.findElement(By.name("postalCode")).sendKeys("411057");
		
		//Selecting drop down value
		WebElement el = dr.findElement(By.name("country"));
		Select select = new Select(el);
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.selectByValue("7");
		Thread.sleep(5000);
		select.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		
		//isMultiple: for multiple selection from list
		
		
		dr.findElement(By.name("email")).sendKeys("Ankush");
		dr.findElement(By.name("password")).sendKeys("1234");
		dr.findElement(By.name("confirmPassword")).sendKeys("1234");
		dr.findElement(By.name("register")).click();
		
		String str = dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(str.length());
		
		String username = "Your Username: "+str.substring(24, 31);
		String password = "Your password: "+"1234";
		
		JavascriptExecutor javascript = (JavascriptExecutor) dr;
		javascript.executeScript("alert(username);");


		
		//dr.quit();
	}
}
