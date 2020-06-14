package Initicials;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
  public static void main(String[] arg) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("https://www.cleartrip.com/");
    Thread.sleep(7000L);
    WebElement frombox = chromeDriver.findElement(By.id("FromTag"));
    frombox.sendKeys(new CharSequence[] { "del" });
    Thread.sleep(5000L);
    List<WebElement> list = chromeDriver.findElements(By.xpath("//a[contains(@id, 'ui-id')]"));
    Thread.sleep(5000L);
    System.out.println(list.size());
    Thread.sleep(6000L);
    for (WebElement webElement : list) {
      String text = webElement.getText();
      System.out.println(text);
    } 
    Thread.sleep(5000L);
    for (WebElement webElement : list) {
      if (webElement.getText().equals("Bogota, CO - Eldorado")) {
        webElement.click();
        System.out.println("its working");
        break;
      } 
      System.out.println("its not working");
    } 
  }
}
