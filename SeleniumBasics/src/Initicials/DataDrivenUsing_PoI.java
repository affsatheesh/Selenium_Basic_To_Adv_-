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
     
     public class DataDrivenUsing_PoI {
     static List<String> Usernamelist = new ArrayList<>();
       
     static List<String> Passwordlist = new ArrayList<>();
       
       public void readExcel() throws IOException {
       FileInputStream excel = new FileInputStream("./Excel/Sheet.xlsx");
       XSSFWorkbook xSSFWorkbook = new XSSFWorkbook(excel);
       Sheet sheet = xSSFWorkbook.getSheetAt(0);
       Iterator<Row> rowcount = sheet.iterator();
       while (rowcount.hasNext()) {
         Row rowvalue = rowcount.next();
         Iterator<Cell> cowcount = rowvalue.iterator();
         int i = 2;
         while (cowcount.hasNext()) {
           if (i % 2 == 0) {
             Usernamelist.add(((Cell)cowcount.next()).getStringCellValue());
             } else {
             Passwordlist.add(((Cell)cowcount.next()).getStringCellValue());
             } 
           i++;
           } 
         } 
       }
     }

