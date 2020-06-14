  package Initicials;
import java.util.List;
     import org.openqa.selenium.By;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.openqa.selenium.support.ui.Select;
     
     public class DropDownUsingSet {
       public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver chromeDriver = new ChromeDriver();
       chromeDriver.get("file:///D:/DropdownHTML%20CODE.html");
       WebElement dropdown = chromeDriver.findElement(By.id("taj"));
      Select sal = new Select(dropdown);
      List<WebElement> optionlist = sal.getOptions();
      int listsize = optionlist.size();
     System.out.println(listsize);
    for (WebElement webElement : optionlist) {
         String text = webElement.getText();
       System.out.println(text);
         } 
       sal.selectByIndex(3);
       }
     }
