package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grow_loginpage3 {
	@FindBy(xpath = "//input[@id='login_password1']")
	private WebElement pwd;
	@FindBy(xpath = "//div[@class='absolute-center btn51ParentDimension']")
	private WebElement submitbtn;

	public grow_loginpage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterpwd(String password) {
		pwd.sendKeys(password);
	}

	public void clickonsbumit() {
		submitbtn.click();
	}

}