package Initicials;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getcelldata(String path, String Sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue = wb.getSheetAt(0).getRow(row).getCell(cell).getStringCellValue();
		return excelvalue;
	}

	public int getRowCount(String path, String Sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheetAt(0).getLastRowNum();
		return rowCount;
	}

	public void SetcellData(String path, String Sheet, int row, int cell, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheetAt(0).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./Excel/Sheet.xlsx");
		wb.write(fos);
		wb.close();
	}
}

