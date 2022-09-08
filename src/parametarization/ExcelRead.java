package parametarization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream excel=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\excel\\Book1.xlsx");
	
	   Sheet sh = WorkbookFactory.create(excel).getSheet("Book1");
	   
	  int row = sh.getLastRowNum();
	  System.out.println(row);
	   
	   for (int i = 0; i <= row; i++) {
		
		  String a = sh.getRow(i).getCell(0).getStringCellValue();
		  System.out.println(a);
	}
	}

}
