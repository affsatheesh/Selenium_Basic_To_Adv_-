package Initicials;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
  public static void main(String[] args) throws AWTException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j0l5j69i65l2.3679j0j7&sourceid=chrome&ie=UTF-8");
    WebElement link = chromeDriver.findElement(By.linkText("Welcome to My Activity - Google"));
    JavascriptExecutor script = (JavascriptExecutor)chromeDriver;
    script.executeScript("window.scroll(0,1800)", new Object[] { "" });
    script.executeScript("window.scroll(0,-500)", new Object[] { "" });
    script.executeScript("window.scrollTo('document.body.scrollHeight')", new Object[] { "" });
    script.executeScript("window.scroll(0,0)", new Object[] { "" });
    script.executeScript("argument[0].ScrollIntoview(true)", new Object[] { link });
    Robot robot = new Robot();
    robot.keyPress(34);
    robot.keyRelease(34);
  }
}
