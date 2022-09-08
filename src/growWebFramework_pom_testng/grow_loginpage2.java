package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grow_loginpage2 {
	@FindBy(xpath = "//input[@id='login_email1']")
	private WebElement emailAdd;
	@FindBy(xpath = "//div[@class='lils382ContinueBtn']")
	private WebElement continuebtn;

	public grow_loginpage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enteremail(String email) {
		emailAdd.sendKeys(email);
	}

	public void continuebtn() {
		continuebtn.click();
	}

}