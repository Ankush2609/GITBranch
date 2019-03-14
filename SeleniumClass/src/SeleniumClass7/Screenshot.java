package SeleniumClass7;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launching Chrome and navigate to the link
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot) dr;
		
		File file =ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\Amazon.png"));
		
		Thread.sleep(5000);
		
		//Random text generation	
		Instant time = Instant.now();
		System.out.println(time);
		System.out.println(UUID.randomUUID().toString());
		
		dr.quit();
	}
}
