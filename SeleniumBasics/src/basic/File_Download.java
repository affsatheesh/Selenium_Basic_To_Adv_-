package basic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/download.html");
			driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		WebElement downloadfile =	driver.findElement(By.xpath("//a[text()='Download Excel']"));
		downloadfile.click();
		
	      File location = new File("C:\\Users\\~ SATHEZ ~\\Downloads");
	      
	    File[] alldownloaddata =  location.listFiles();
	    for(File data:alldownloaddata)
	    {
	    	System.out.println(data.getName());
	    	if(data.getName().equals("testleaf.xlsx"))
	    			{
	    		System.out.println("filedownloaded");
	    		break;
	    			}
	    }
	}
}
