package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grow_loginPage4 {
	@FindBy(xpath = "(//div[contains(@class,'onb23OnboardingPage')])//img[1]")
	private WebElement growlogo;

	public grow_loginPage4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickongrow(WebDriver driver) {
		Actions act = new Actions(driver);
		act.click(growlogo).perform();

	}

}