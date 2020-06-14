package Initicials;
import java.io.FileInputStream;
     import java.io.IOException;
     import java.util.ArrayList;
     import java.util.Iterator;
     import java.util.List;
     import org.apache.poi.ss.usermodel.Cell;
     import org.apache.poi.ss.usermodel.Row;
     import org.apache.poi.ss.usermodel.Sheet;
     import org.apache.poi.xssf.usermodel.XSSFWorkbook;
     import org.openqa.selenium.By;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     
     public class Facebook_DataDrivenMethodUse {
    static List<String> username = new ArrayList<>();
       
     static List<String> password = new ArrayList<>();
       
       public void Excelreading() throws IOException {
       FileInputStream excel = new FileInputStream("./data/sheet.xlsx");
       XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(excel);
       Sheet sheet = xSSFWorkbook.getSheetAt(0);
       Iterator<Row> Rowcount = sheet.iterator();
      while (Rowcount.hasNext()) {
         Row rowvalue = Rowcount.next();
         Iterator<Cell> cellvalue = rowvalue.iterator();
         int i = 2;
         while (cellvalue.hasNext()) {
           if (i % 2 == 0) {
             username.add(((Cell)cellvalue.next()).getStringCellValue());
             } else {
             password.add(((Cell)cellvalue.next()).getStringCellValue());
             } 
           i++;
           } 
         } 
       }
       
       public void property(String uname, String pword) {
       System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver chromeDriver = new ChromeDriver();
      chromeDriver.get("https://www.facebook.com/");
      WebElement username = chromeDriver.findElement(By.id("email"));
       username.sendKeys(new CharSequence[] { uname });
       WebElement password = chromeDriver.findElement(By.id("pass"));
       password.sendKeys(new CharSequence[] { pword });
      WebElement submit = chromeDriver.findElement(By.id("u_0_b"));
       submit.click();
       }
       
       public void forloopsss() {
       for (int i = 0; i < username.size(); i++)
         property(username.get(i), password.get(i)); 
       }
       
       public static void main(String[] arg) throws IOException {
       Facebook_DataDrivenMethodUse excelfile = new Facebook_DataDrivenMethodUse();
       excelfile.Excelreading();
       System.out.println("username =  " + username);
       System.out.println("password =  " + password);
       excelfile.forloopsss();
       }
     }
