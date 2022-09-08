package frameworkGlobalSQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculater {

	@FindBy(xpath = "/html/body/div/table/tbody/tr[1]/td[2]/input")
	private WebElement a;
	@FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td[2]/input")
	private WebElement b;
	@FindBy(xpath = "(//button[@class='command'])[1]")
	private WebElement btn1;
	@FindBy(xpath = "(//button[@class='command'])[2]")
	private WebElement btn2;
	@FindBy(xpath = "(//button[@class='command'])[3]")
	private WebElement btn3;
	@FindBy(xpath = "(//button[@class='command'])[4]")
	private WebElement btn4;

	@FindBy(xpath = "//select[@class='ng-pristine ng-valid']")
	private WebElement opatetor;

	public Calculater(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void inputA() {

		a.sendKeys("5");

	}

	public void inputB() {

		b.sendKeys("5");
	}

	public void incrementBtn1() {
		btn1.click();
	}

	public void decrementBtn4() {
		btn4.click();
	}

}
