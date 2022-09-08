package frameworkOrangeHQ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		//FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\excel\\Book1.xlsx");

		//Sheet value = WorkbookFactory.create(file).getSheet("sheet2");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// login page called

		LoginPage login = new LoginPage(driver);
		// String UNValue = value.getRow(0).getCell(0).getStringCellValue();
		login.LoginPageUsername();

		// String pwdvalue=value.getRow(0).getCell(1).getStringCellValue();
		login.LoginPagePassword();

		login.LoginBtn();

	}

}
