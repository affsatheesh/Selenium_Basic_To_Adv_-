package Initicials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_Disbled_Elelments {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("file:///D:/disabled.html");
    WebElement username = chromeDriver.findElement(By.id("i1"));
    username.sendKeys(new CharSequence[] { "sathez" });
    RemoteWebDriver remote = (RemoteWebDriver)chromeDriver;
    remote.executeScript("document.getElementById('i2').value='manager'", new Object[0]);
  }
}
