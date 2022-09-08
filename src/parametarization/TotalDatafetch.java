package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalDatafetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\excel\\Book1.xlsx");

		Sheet value = WorkbookFactory.create(file).getSheet("sheet1");

		int lastRow = value.getLastRowNum();
		for (int i = 0; i <=lastRow; i++) {
			int lastCellIndex = value.getRow(i).getLastCellNum()-1;

			for (int j = 0; j <= lastCellIndex; j++) {

				String v = value.getRow(i).getCell(j).getStringCellValue();
				System.out.print(v+" ");

			}
			System.out.println(" ");
		}

	}
}