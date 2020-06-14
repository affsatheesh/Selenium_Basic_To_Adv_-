package Initicials;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
  public static void main(String[] arg) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/table.html");
    List<WebElement> cow = chromeDriver.findElements(By.tagName("th"));
    int cowsize = cow.size();
    System.out.println(cowsize);
    List<WebElement> row = chromeDriver.findElements(By.tagName("td"));
    int rowsize = row.size();
    System.out.println(rowsize);
    WebElement percentage = chromeDriver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following :: td[1]"));
    String text = percentage.getText();
    System.out.println(text);
  }
}
