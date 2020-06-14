package Initicials;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/Window.html");
    String fatherwindow = chromeDriver.getWindowHandle();
    WebElement window1 = chromeDriver.findElement(By.xpath("//button[@id='home']"));
    window1.click();
    Set<String> childwindow = chromeDriver.getWindowHandles();
    for (String string : childwindow)
      chromeDriver.switchTo().window(string); 
    WebElement clicker = chromeDriver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
    clicker.click();
    chromeDriver.close();
    chromeDriver.switchTo().window(fatherwindow);
    WebElement windows2 = chromeDriver.findElement(By.xpath("//button[@onclick='openWindows()']"));
    windows2.click();
    int numberofwindows = chromeDriver.getWindowHandles().size();
    System.out.println("how many window open : " + numberofwindows);
    WebElement window3 = chromeDriver.findElement(By.xpath("//button[@id='color'][@onclick='openWindows();']"));
    window3.click();
    Set<String> allwindows = chromeDriver.getWindowHandles();
    for (String string : allwindows) {
      if (!string.equals(fatherwindow)) {
        chromeDriver.switchTo().window(string);
        String title = chromeDriver.getTitle();
        System.out.println(title);
        System.out.println("all windows are close");
        chromeDriver.close();
      } 
    } 
  }
}
