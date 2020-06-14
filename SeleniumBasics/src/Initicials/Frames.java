package Initicials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/frame.html");
    chromeDriver.switchTo().frame(0);
    WebElement iframe1 = chromeDriver.findElement(By.xpath("//button [@id='Click']"));
    iframe1.click();
    String frameDetails = iframe1.getText();
    System.out.println("first frame details : " + frameDetails);
    chromeDriver.switchTo().defaultContent();
    chromeDriver.switchTo().frame(1);
    chromeDriver.switchTo().frame("frame2");
    WebElement iframe2 = chromeDriver.findElement(By.xpath("//button[@id='Click1']"));
    iframe2.click();
    String frameDetails2 = iframe2.getText();
    System.out.println("second frame details : " + frameDetails2);
    chromeDriver.switchTo().defaultContent();
    WebElement tagnameDetails = chromeDriver.findElement(By.tagName("iframe"));
    System.out.println(tagnameDetails);
    chromeDriver.close();
  }
}
