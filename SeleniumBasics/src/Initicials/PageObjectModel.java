package Initicials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageObjectModel {
  public static WebElement txtUsername;
  
  public static WebElement txtPassword;
  
  public static WebElement Submit;
  
  @Test
  public void Mainclass() {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("https://opensource-demo.orangehrmlive.com/");
    PageFactory.initElements((WebDriver)chromeDriver, PageObjectModel.class);
    txtUsername.sendKeys(new CharSequence[] { "Admin" });
    txtPassword.sendKeys(new CharSequence[] { "admin123" });
    Submit.click();
  }
}
