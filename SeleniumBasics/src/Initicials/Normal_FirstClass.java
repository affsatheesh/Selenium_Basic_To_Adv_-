package Initicials;   
import org.openqa.selenium.chrome.ChromeDriver;
     
     public class Normal_FirstClass {
       public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
       chromeDriver.get("https://www.cleartrip.com/");
       }
     }