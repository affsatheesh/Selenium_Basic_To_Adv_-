package Initicials;
import java.io.IOException;
     import org.apache.poi.EncryptedDocumentException;
     
     public class DataDrivenMainClass {
       public static void main(String[] args) throws EncryptedDocumentException, IOException {
       String excelpath = "./Excel/Sheet.xlsx";
       FileLib file = new FileLib();
      int rc = file.getRowCount(excelpath, "data");
      System.out.println(rc);
      for (int i = 0; i <= rc; i++) {
        String un = file.getcelldata(excelpath, "data", i, 0);
       System.out.println(un);
         } 
       }
     }


