package Initicials;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders {
  static List<String> usernamelist = new ArrayList<>();
  
  static List<String> passwordlist = new ArrayList<>();
  
  public void ExcelData() throws EncryptedDocumentException, IOException {
    FileInputStream Excel = new FileInputStream("./data/Sheet.xlsx");
    XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(Excel);
    Sheet sheetdetails = xSSFWorkbook.getSheetAt(0);
    Iterator<Row> rowcount = sheetdetails.iterator();
    while (rowcount.hasNext()) {
      Row rowvalue = rowcount.next();
      Iterator<Cell> cellcount = rowvalue.iterator();
      int i = 2;
      while (cellcount.hasNext()) {
        if (i % 2 == 0) {
          usernamelist.add(((Cell)cellcount.next()).getStringCellValue());
        } else {
          passwordlist.add(((Cell)cellcount.next()).getStringCellValue());
        } 
        i++;
      } 
    } 
  }
  
  public void login(String uname, String pword) {
    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver chromeDriver = new ChromeDriver();
    chromeDriver.get("https://opensource-demo.orangehrmlive.com/");
    WebElement Username = chromeDriver.findElement(By.name("txtUsername"));
    Username.sendKeys(new CharSequence[] { uname });
    WebElement Password = chromeDriver.findElement(By.name("txtPassword"));
    Password.sendKeys(new CharSequence[] { pword });
    WebElement login = chromeDriver.findElement(By.name("Submit"));
    login.submit();
    chromeDriver.quit();
  }
  
  public void executeTest() {
    for (int i = 0; i < usernamelist.size(); i++)
      login(usernamelist.get(i), passwordlist.get(i)); 
  }
  
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
    Qspiders usingpoi = new Qspiders();
    usingpoi.ExcelData();
    System.out.println("username : " + usernamelist);
    System.out.println("username : " + passwordlist);
    usingpoi.executeTest();
  }
}
