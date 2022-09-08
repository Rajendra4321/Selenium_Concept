package growWebFramework_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {

	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement pin1;
	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement pin2;
	@FindBy(xpath = "(//input[@type='number'])[3]")
	private WebElement pin3;
	@FindBy(xpath = "(//input[@type='number'])[4]")
	private WebElement pin4;

	public PinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Sendpin1(String p1) {

		pin1.sendKeys(p1);

	}

	public void Sendpin2(String p2) {

		pin2.sendKeys(p2);

	}

	public void Sendpin3(String p3) {

		pin3.sendKeys(p3);

	}

	public void Sendpin4(String p4) {

		pin4.sendKeys(p4);

	}
}