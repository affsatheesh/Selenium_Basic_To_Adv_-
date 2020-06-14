package basic;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Element
{
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/disabled.html");
		
	    driver.findElement(By.id("i1")).sendKeys("sathez");
          
	
	JavascriptExecutor Executer =(JavascriptExecutor) driver;
	Executer.executeScript("document.getElementById('i2').value='manager'");
	}
	
}
