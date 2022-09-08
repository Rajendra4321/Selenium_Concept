package frameworkGlobalSQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ClosePage {
    @FindBy(xpath = "//div[@id='dismiss-button']")private WebElement close;
	public ClosePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void closebtn() {
		close.click();
	}

}
