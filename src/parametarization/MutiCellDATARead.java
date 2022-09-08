package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MutiCellDATARead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\excel\\Book1.xlsx");
	
		Sheet value = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastRow = value.getRow(0).getLastCellNum() - 1;

		for (int i = 0; i <= lastRow; i++) {
			String s = value.getRow(0).getCell(i).getStringCellValue();
			System.out.print(" " + s);

		}
	}
	
}
