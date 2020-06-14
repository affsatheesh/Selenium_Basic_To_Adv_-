package Initicials;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {
  public static void main(String[] args) throws AWTException, InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("https://tus.io/demo.html");
    WebElement cfile = chromeDriver.findElement(By.xpath("/html/body/div/div[3]/div/p[3]/input"));
    Actions action = new Actions((WebDriver)chromeDriver);
    action.moveToElement(cfile).click(cfile).build().perform();
    Thread.sleep(5000L);
    String file = "C:\\Users\\~ SATHEZ ~\\testleaf.xlsx";
    StringSelection selection = new StringSelection(file);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    Robot robot = new Robot();
    robot.keyPress(17);
    robot.keyPress(86);
    robot.keyRelease(86);
    robot.keyRelease(17);
    Thread.sleep(2000L);
    robot.keyPress(10);
    robot.keyRelease(10);
  }
}
