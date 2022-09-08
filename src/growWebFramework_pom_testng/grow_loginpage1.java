package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grow_loginpage1 {
	@FindBy(xpath = "(//div[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")
	private WebElement loginreg;

	public grow_loginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnloginreg() {
		loginreg.click();
	}
}