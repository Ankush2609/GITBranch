package SeleniumClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		//Launching Chrome and navigate to the link
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		String path = System.getProperty("webdriver.chrome.driver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(dr);
		WebElement src = dr.findElement(By.cssSelector("li#credit2"));
		WebElement trg = dr.findElement(By.cssSelector("ol#bank"));
		
		Action a = act.dragAndDrop(src, trg).build();
		
		
		a.perform();
	}

}


