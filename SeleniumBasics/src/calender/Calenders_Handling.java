package calender;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders_Handling
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.goibibo.com/");
	driver.findElement(By.id("departureCalendar")).click();
	WebElement navButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
	navButton.click();
	WebElement Date = driver.findElement(By.xpath("//div[text()='12']"));
	Date.click();
	Thread.sleep(5000);
	driver.findElement(By.id("returnCalendar")).click();
	Thread.sleep(5000);
	WebElement Next = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
     Next.click();
	Thread.sleep(5000);
	WebElement returndate = driver.findElement(By.xpath("//div[text()='17']"));
	Thread.sleep(5000);
	}
	
	
}
