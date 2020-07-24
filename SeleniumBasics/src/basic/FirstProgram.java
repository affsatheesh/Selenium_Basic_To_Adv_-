package basic;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class FirstProgram
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.developer-connector-mern.com/");
	    driver.findElement(By.xpath("//a[@id='landing__btn-login']")).click();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("affsatheesh@gmail.com");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Timeover");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	           
//	     String title = driver.getTitle();
//	           System.out.println(title);
//	     String url = driver.getCurrentUrl();
//	     System.out.println(url);
	    Thread.sleep(3000);
	     
		WebElement profile = driver.findElement(By.id("dashboard__create-profile-btn"));
		profile.click();

WebElement	profilehandle =	driver.findElement(By.xpath("//input[@name='handle']"));
	profilehandle.sendKeys("affsatheesh@gmail.com");

	}
	}
