package Initicials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobox {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("http://www.leafground.com/pages/radio.html");
    WebElement radio = chromeDriver.findElement(By.xpath("//input[@type='radio'] [@id='yes']"));
    radio.click();
    Boolean option = Boolean.valueOf(radio.isSelected());
    System.out.println(option);
    if ((option = Boolean.valueOf(false)).booleanValue()) {
      System.out.println("1st option selected");
    } else {
      System.out.println("2nd option selected");
      WebElement secondbutton = chromeDriver.findElement(By.xpath(" //input[@type='radio'][@id='no']"));
      secondbutton.click();
      Boolean seconnd = Boolean.valueOf(secondbutton.isSelected());
      System.out.println(seconnd);
    } 
  }
}
