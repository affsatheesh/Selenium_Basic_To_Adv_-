package Initicials;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    chromeDriver.get("https://www.flipkart.com/");
    chromeDriver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    WebElement electronices = chromeDriver.findElement(By.xpath("//*[.='TVs & Appliances']"));
    Actions action = new Actions((WebDriver)chromeDriver);
    action.moveToElement(electronices).build().perform();
  }
}