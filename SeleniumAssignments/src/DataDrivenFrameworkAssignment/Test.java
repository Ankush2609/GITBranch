package DataDrivenFrameworkAssignment;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test 
{
	WebDriver dr;
	WebDriverWait wait;
	
	public Test(WebDriver dr) 
	{
		this.dr = dr;
		wait = new WebDriverWait(dr, 60);
	}	
	public boolean register()
	{
		//01. Launch application
		dr.get("https://www.freecrm.com/index.html");
		
		//02. Loader Check
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"preloader\"]")));
		dr.findElement(By.xpath("//div[@id=\"navbar-collapse\"]//li//a[@href=\"https://www.freecrm.com/register/\"]")).click();
		
		//03. Registration page: 01
		Select EditionType = new Select(dr.findElement(By.id("payment_plan_id")));
		EditionType.selectByVisibleText("Free Edition");
		dr.findElement(By.name("first_name")).sendKeys("Narendra");
		dr.findElement(By.name("surname")).sendKeys("Modi");
		dr.findElement(By.name("email")).sendKeys("Namo@gmail.com");
		dr.findElement(By.name("email_confirm")).sendKeys("Namo@gmail.com");
		dr.findElement(By.name("username")).sendKeys("Narendra12");
		dr.findElement(By.name("password")).sendKeys("Abcd1234");
		dr.findElement(By.name("passwordconfirm")).sendKeys("Abcd1234");
		dr.findElement(By.name("agreeTerms")).click();	
		dr.findElement(By.name("submitButton")).click();
		
		//Check for alert
		try 
		{
			ExpectedCondition<Alert> alert = ExpectedConditions.alertIsPresent();
			
			if(alert!=null) 
			{
				dr.switchTo().alert().accept();
				return false;
			}
		} 
		catch (NoAlertPresentException e) 
		{
			e.printStackTrace();
		}
		
		//04. Registration page: 02
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_name")));
		dr.findElement(By.name("company_name")).sendKeys("TCS");
		dr.findElement(By.name("phone")).sendKeys("1234567890");
		dr.findElement(By.name("fax")).sendKeys("1234567890");
		dr.findElement(By.name("website")).sendKeys("https://www.google.com");
		dr.findElement(By.name("company_email")).sendKeys("tcs@tcs.com");
		dr.findElement(By.name("service")).sendKeys("This is test");
		dr.findElement(By.name("address")).sendKeys("Address");
		dr.findElement(By.name("city")).sendKeys("Pune");
		dr.findElement(By.name("state")).sendKeys("Maharashtra");
		dr.findElement(By.name("postcode")).sendKeys("411057");		
		Select Country = new Select(dr.findElement(By.name("country")));
		Country.selectByValue("India");		
		dr.findElement(By.name("copy_address")).click();
		dr.findElement(By.name("btnSubmit")).click();
		
		//04. Registration page: 03
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("role_id")));
		Select Role = new Select(dr.findElement(By.name("role_id")));
		Role.selectByVisibleText("User Administrator");		
		dr.findElement(By.name("finish")).click();
		
		//05. Final Message check
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"text_orange\"]")));
		String message = dr.findElement(By.xpath("//div[@class=\"text_orange\"]")).getText();

		if(message.equals("Your account is now registered.")) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	public void login() throws IOException, InterruptedException
	{
		//01. Launch application
		dr.get("https://www.freecrm.com/index.html");
		
		//FileWriter fw = new FileWriter("C:\\Users\\ankus\\eclipse-workspace\\SeleniumAssignments\\Properties\\test.properties");
		FileReader fr = new FileReader("C:\\Users\\ankus\\eclipse-workspace\\SeleniumAssignments\\Properties\\test.properties");
		Properties p = new Properties();
		p.load(fr);
		//System.out.println(p.getProperty("username"));
		
		//02. Loader Check
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"preloader\"]")));
		//Thread.sleep(15000);
		dr.findElement(By.name(p.getProperty("username"))).sendKeys("Narendra12");
		dr.findElement(By.name("password")).sendKeys("Abcd1234");
		dr.findElement(By.xpath("//input[@type=\"submit\"]")).click();	
		fr.close();
	}
}
