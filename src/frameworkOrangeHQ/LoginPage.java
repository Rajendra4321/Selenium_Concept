package frameworkOrangeHQ;

import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement UN;
	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement pwd;
	@FindBy(xpath = "//input[@class='button']")
	private WebElement btn;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void LoginPageUsername(){
		UN.sendKeys("Admin");
	}

	// enter pwd
	public void LoginPagePassword() {
		pwd.sendKeys("admin123");

	}

	// click on login btn
	public void LoginBtn() {
		
	btn.click();
	}

}
