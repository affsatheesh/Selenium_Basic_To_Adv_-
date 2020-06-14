package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	WebElement loginclose =	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	loginclose.click();
	
	// Using Actions class
		
		Actions action = new Actions(driver);
	WebElement Electronics = 	driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(Electronics).build().perform();
	WebElement Oppo = driver.findElement(By.xpath("//a[text()='OPPO']"));
	action.contextClick(Oppo).build().perform();
	WebElement contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
	action.doubleClick(contact).build().perform();
	
	// Using Robot Class
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	}
	
	

}
