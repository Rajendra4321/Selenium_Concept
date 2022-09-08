package frameworkGlobalSQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamePage {
        @FindBy(xpath = "(//a[@class='button tiny_button button_pale regular_text'])[8]")private WebElement calBtn;
        
	public HamePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnCalculaterBtn() {
		
		calBtn.click();
	}
}
