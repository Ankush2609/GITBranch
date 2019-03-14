package po;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class freeCRMPO {

	private WebDriver driver;
	public freeCRMPO freeCRMPO= null;
	//freeCRMPO freeCRMPO = new freeCRMPO(driver);

	public freeCRMPO(WebDriver driver) {
		
		
		System.out.println("Constru2");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	Properties pr;
	File fr;
	FileInputStream file;
	
	@FindBy(linkText="Sign Up")
	public WebElement SignUp;
	@FindBy(name="username")
	public WebElement userName;
	@FindBy(name="password")
	public WebElement passWord;
	@FindBy(name="passwordconfirm")
	public WebElement confirmpassWord;
	@FindBy(name="first_name")
	public WebElement firstName;
	@FindBy(name="surname")
	public WebElement lastName;
	@FindBy(name="email")
	public WebElement email;
	@FindBy(name="email_confirm")
	public WebElement confirmEmail;
	@FindBy(name="agreeTerms")
	public WebElement agreeTerms;
	@FindBy(id="submitButton")
	public WebElement submitButton;

	

	public void loadProperties() throws IOException {
		System.out.println("Load Start...");
		pr= new Properties();
		fr = new File("C:\\Users\\ankus\\eclipse-workspace\\TestAutomation\\src\\main\\java\\env.properties");
		file = new FileInputStream(fr);
		pr.load(file);
		System.out.println("Loaded");
	}

	public void lanchapp() throws IOException{
		System.out.println("Test");
		//freeCRMPO freeCRMPO= new freeCRMPO(driver);
				freeCRMPO.loadProperties();
		driver.get(freeCRMPO.pr.getProperty("URL"));
		driver.manage().window().maximize();
	}

	public void signup()
	{
		SignUp.click();
		//freeCRMPO.implicitwait();
		userName.sendKeys("Ankush");
		passWord.sendKeys("Ankush");
		confirmpassWord.sendKeys("Ankush");
		firstName.sendKeys("Ankush");
		lastName.sendKeys("W");
		email.sendKeys("abc@abc.com");
		confirmEmail.sendKeys("abc@abc.com");
		agreeTerms.click();
		submitButton.click();
	}

	public void login()
	{

	}

	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void Explicitwait()
	{

	}

	public void FluentWait()
	{

	}
	

}
