package allConcet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		

		WebElement f = driver.findElement(By.xpath("(//div[@class='widget-content'])[2]"));
		f.click();

		List<WebElement> t = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));

		System.out.println(t.size());

		/** Non-functional JAVA version of this method. */
		for (WebElement cell : t) {
			String cellText = cell.getText();
			if (cellText.contains("16")) {
				cell.click();
				break;
			}
		}
	}
}
