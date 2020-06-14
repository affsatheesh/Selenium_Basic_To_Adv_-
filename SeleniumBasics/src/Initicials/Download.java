package Initicials;
import java.io.File;
     import org.openqa.selenium.By;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     
     public class Download {
       public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
     ChromeDriver chromeDriver = new ChromeDriver();
       chromeDriver.get("http://www.leafground.com/pages/download.html");
       WebElement downloadfile = chromeDriver.findElement(By.linkText("Download Excel"));
       downloadfile.click();
       File loc = new File("C:\\Users\\~ SATHEZ ~\\Downloads");
       File[] everythingStroed = loc.listFiles();
         byte b;
         int i;
         File[] arrayOfFile1;
       for (i = (arrayOfFile1 = everythingStroed).length, b = 0; b < i; ) {
         File file = arrayOfFile1[b];
        if (file.getName().equals("testleaf.xlsx")) {
          System.out.println("file download successfully");
             break;
           } 
           b++;
         } 
       }
     }
