package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grow_homepage {

	@FindBy(xpath = "//img[@class='circle']")
	private WebElement loginreg1;
	@FindBy(xpath = "//a[@class='nameAnchor']")
	private WebElement actloginreg;
	@FindBy(xpath = "//input[@id=\"globalSearch23\"]")
	private WebElement search;

	public grow_homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void HomeloginProfile() {
		loginreg1.click();
	}

	public String getgrowHomePageUsrID() {
		String actUserID = actloginreg.getText();
		return actUserID;
	}

	public void inputStockInSeachBox(String inputsearch) {
		search.sendKeys(inputsearch);
	}

//		public void verfiyloginreg(String expID)
//		{
//		   
//		   
//			String exploginreg = "Rajendra Gundopant Patil";
//			System.out.println(exploginreg);
//			if(actUserID.equals(exploginreg)) 
//			{
//				System.out.println("Pass");
//			}
//			else
//			{
//				System.out.println("Fail");
//			}
//		}
}
