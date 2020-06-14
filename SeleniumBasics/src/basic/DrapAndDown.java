package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrapAndDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
	    WebElement dropdown =	driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		
	// Print the all Dropdown Options
		
		List<WebElement> options = select.getOptions();
//		int Dropdown_size = options.size();
//		System.out.println(Dropdown_size);
//		
//		for(WebElement alloptions: options)
//		{
//		String text = alloptions.getText();
//		System.out.println(text);
//		}
		
	//Select Options
		select.selectByIndex(1);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		
	// Select By Last to First
		for(int i=options.size()-1;i>=0;i--)
		{
			select.selectByIndex(i);
			System.out.println(i);
	  }
  
	}

}
