package growWebFramework_pom_testng;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groww_testTC1 extends BaseClass {
	grow_loginpage1 page1;
	grow_loginpage2 page2;
	grow_loginpage3 page3;
	grow_loginPage4 page4;
	PinPage pinpage;
	grow_homepage home;
	int TCID;

	@BeforeClass
	public void openWebpage() throws EncryptedDocumentException, IOException {

		Reporter.log("--Open browser--", true);
		initializeBrowser();
		page1 = new grow_loginpage1(driver);
		page2 = new grow_loginpage2(driver);
		page3 = new grow_loginpage3(driver);
		page4 = new grow_loginPage4(driver);
		pinpage = new PinPage(driver);
		home = new grow_homepage(driver);
	}

	@BeforeMethod
	public void loginPage() throws IOException {
		Reporter.log("--Login To App--", true);
		page1.clickOnloginreg();

		page2.enteremail(UtilityMethods.getPF("emailAdd"));
		page2.continuebtn();

		page3.enterpwd(UtilityMethods.getPF("pwd"));
		page3.clickonsbumit();

		page4.clickongrow(driver);

		pinpage.Sendpin1(UtilityMethods.getPF("pwdpin1"));
		pinpage.Sendpin2(UtilityMethods.getPF("pwdpin2"));
		pinpage.Sendpin3(UtilityMethods.getPF("pwdpin3"));
		pinpage.Sendpin4(UtilityMethods.getPF("pwdpin4"));

		home.HomeloginProfile();
	}

//	@Test
//	public void TC1() throws EncryptedDocumentException, IOException {
//		TCID = 102;
//		Reporter.log("running verify User ID TC1", true);
//
//		String actUserID = home.getgrowHomePageUsrID();
//		;
//		String expUserId = UtilityMethods.getTD(0, 0);
//		Assert.assertEquals(actUserID, expUserId, "--Failed: both results are diff--");
//	}
	@Test
	public void SearchBox() throws EncryptedDocumentException, IOException, InterruptedException {
		TCID = 102;
		Reporter.log("running verify User ID TC2", true);
		Thread.sleep(2000);
		home.inputStockInSeachBox(UtilityMethods.getTD(1, 0));
		
//List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
//		
//		String expText = "redmi 10 prime";
//		
//		for(WebElement option:allOptions)
//		{
//			String actText = option.getText();
//			System.out.println(actText);
//			
//			if(actText.equals(expText))
//			{
//				option.click();
//				break;  
//			}						
//		}
	
	}

	@AfterMethod
	public void logoutPage(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			UtilityMethods.captureScreenshot(driver, TCID);
		}

		Reporter.log("--logout To App--", true);

	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("--Open browser--", true);
		// driver.close();
		page1 = null;
		page2 = null;
		page3 = null;
		page4 = null;
		home = null;
		driver = null;

	}

}
