package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox1 =driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertbox1.click();
		
		Alert alert1 = driver.switchTo().alert();
		String text1 =	alert1.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);

		Thread.sleep(3000);
		
		WebElement alertbox2 =driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		alertbox2.click();
		Thread.sleep(8000);
		Alert alert2 = driver.switchTo().alert();
		String text2 =	alert2.getText();
		System.out.println(text2);
		alert2.accept();


		WebElement alertbox3 =driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		alertbox3.click();
		Thread.sleep(8000);
		Alert alert3 = driver.switchTo().alert();
		String text3 =	alert3.getText();
		System.out.println(text3);
		alert3.sendKeys("sathez");
		alert3.accept();

		 driver.close();
	}

}
