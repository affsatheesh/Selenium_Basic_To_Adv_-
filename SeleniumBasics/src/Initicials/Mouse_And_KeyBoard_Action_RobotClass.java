package Initicials;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_And_KeyBoard_Action_RobotClass {
  public static void main(String[] args) throws AWTException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("file:///D:/DropdownHTML%20CODE.html");
    WebElement dropdown = chromeDriver.findElement(By.id("taj"));
    Actions action = new Actions((WebDriver)chromeDriver);
    action.doubleClick(dropdown).build().perform();
  }
}
