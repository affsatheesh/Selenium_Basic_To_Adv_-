package Initicials;
import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.openqa.selenium.interactions.Actions;
     
     public class DragAndDroppable {
       public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver chromeDriver = new ChromeDriver();
       chromeDriver.get("http://www.leafground.com/pages/drop.html");
             WebElement from = chromeDriver.findElement(By.id("draggable"));
       WebElement To = chromeDriver.findElement(By.id("droppable"));
      Thread.sleep(7000L);
      Actions action = new Actions((WebDriver)chromeDriver);
      action.clickAndHold(from).moveToElement(To).release(To).build().perform();
       action.dragAndDrop(from, To).perform();
       }
     }
