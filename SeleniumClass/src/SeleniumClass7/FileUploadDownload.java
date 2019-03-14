package SeleniumClass7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadDownload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		dr.findElement(By.xpath("//a[@class=\"btn redlove btn-xl\"]")).click();
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(dr, 60);
		
		//Delete file if already exists
		File file = new File("C:\\Users\\ankus\\Downloads\\Ankush Wasankar_Sr_Test_Analyst.pdf");
		
		if(file.exists())
		{
			file.delete();
			System.out.println("File was exists. File Deleted.");
		}
		
		//Clipboard -- To stored copied URL/Link java.awt.datatransfer
		//Toolkit - java.awt
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection ss = new StringSelection("C:\\Users\\ankus\\OneDrive\\Desktop\\Interview Prep\\Ankush Wasankar_Sr_Test_Analyst.docx");
		cb.setContents(ss, null);
		
		//Robot to handle the windows
		Robot rb = new Robot();
		
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"uploadfiles\"]")));
		dr.findElement(By.xpath("//a[@id=\"uploadfiles\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"download\"]")));
		
		//Verify the file is download correctly
		
		//File file = new File("C:\\Users\\ankus\\Downloads\\Ankush Wasankar_Sr_Test_Analyst.pdf");
		
		Thread.sleep(15000);
		
		System.out.println("File Exists: "+file.exists());
		
		Thread.sleep(5000);
		//dr.quit();
	}

}
