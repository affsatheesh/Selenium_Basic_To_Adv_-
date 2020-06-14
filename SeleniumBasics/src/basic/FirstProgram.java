package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ddaddr=driver.findElement(By.name("q"));
		ddaddr.sendKeys("Qspiders old");
		Thread.sleep(2000);
		{
			List<WebElement> alloptions = driver.findElements(By.xpath("//li[@class='sbct']"));
			System.out.println(alloptions.size());
			for(int i=0;i<alloptions.size();i++)
			{
				WebElement oneoption = alloptions.get(i);
				String text = oneoption.getText();
				System.out.println(text);
			}
			Thread.sleep(3000);
			ddaddr.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			ddaddr.sendKeys(Keys.ENTER);
		}
		
		// print all in google search Result
		List<WebElement>alllinks=driver.findElements(By.tagName("//a"));
		for(WebElement links:alllinks)
		{
			String linklist =   links.getAttribute("href");
			System.out.println(linklist);
		}
		
		// print all main links
		List<WebElement> Mainlinks = driver.findElements(By.xpath("//cite"));
		for(WebElement Main:Mainlinks)
		{
			String Maintext =  Main.getText();
			System.out.println(Maintext);
		}
	}
	}
