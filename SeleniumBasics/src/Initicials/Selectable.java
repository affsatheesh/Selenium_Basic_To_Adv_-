package Initicials;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/selectable.html");
    List<WebElement> selectable = chromeDriver.findElements(By.xpath("//ol[@id='selectable']/li"));
    int listofelements = selectable.size();
    System.out.println(listofelements);
    Actions action = new Actions((WebDriver)chromeDriver);
    action.keyDown((CharSequence)Keys.CONTROL).click(selectable.get(0)).build().perform();
    action.keyDown((CharSequence)Keys.CONTROL).click(selectable.get(2)).build().perform();
    action.keyDown((CharSequence)Keys.CONTROL).click(selectable.get(4)).build().perform();
    Thread.sleep(8000L);
    chromeDriver.close();
  }
}
