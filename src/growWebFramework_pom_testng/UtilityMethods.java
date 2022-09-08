package growWebFramework_pom_testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods {
	// This method is use to get test data from excel sheet
	// need to pass 2 parameters 1. rowIndex 2. colIndex
	// Author name: Sanjay
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}

	// This method is use to capture screenshot of webpage
	// need to pass 2 parameters 1. webdriver Object 2. TCID
	// Author name: Sanjay
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\New folder\\ScreenShotSelenium\\raj2_"+TCID+".jpg");
		FileHandler.copy(src, dest);

	}

//	 this method is use to read property file data
//	 need pass 1 parameter: String key
//	 Author name: Sanjay
	public static String getPF(String key) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\property.properties");

		Properties p = new Properties();
		p.load(file);

		String value = p.getProperty(key);

		return value;
	}
}
