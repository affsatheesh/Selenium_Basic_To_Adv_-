package Initicials;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/table.html");
    List<WebElement> cow = chromeDriver.findElements(By.tagName("th"));
    int cowsize = cow.size();
    System.out.println(cowsize);
    List<WebElement> Row = chromeDriver.findElements(By.tagName("tr"));
    int Rowsize = Row.size();
    System.out.println(Rowsize);
    WebElement percentage = chromeDriver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
    String secondtablesize = percentage.getText();
    System.out.println(secondtablesize);
    List<Integer> numberlist = new ArrayList<>();
    List<WebElement> strg = chromeDriver.findElements(By.xpath("//td[2]"));
    Thread.sleep(5000L);
    for (WebElement webElement : strg) {
      String singalvalue = webElement.getText().replace("%", " ");
      Thread.sleep(5000L);
      numberlist.add(Integer.valueOf(Integer.parseInt(singalvalue)));
    } 
    System.out.println(numberlist);
  }
}
