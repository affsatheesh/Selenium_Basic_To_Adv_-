package Initicials;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
  public static void main(String[] args) throws IOException, AWTException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("file:///D:/DropdownHTML%20CODE.html");
    WebElement place = chromeDriver.findElement(By.xpath("//select[@id='taj']"));
    File sourcefile1 = (File)place.getScreenshotAs(OutputType.FILE);
    File des1 = new File("D:\\eventfiring.pnp");
    FileHandler.copy(sourcefile1, des1);
    chromeDriver.close();
  }
}
