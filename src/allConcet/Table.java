package allConcet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)", true);

		List<WebElement> thSize = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));

		int theader = thSize.size();
		System.out.println(theader);

		for (WebElement th : thSize) {
			System.out.println(th.getText());
		}

		List<WebElement> tdSize = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));

		
		int td=tdSize.size();
		System.out.println(td);

		for (int i = 1; i <= td; i++) {

			for (int j = 1; j <=theader ; j++)

				if (i == 1) {
					String text = driver.findElement(By.xpath("(//tbody)[1]//tr[" + i + "]/th[" + j + "]")).getText(); // runtime
																														// xpath
					System.out.print(" " + text);

				} else {
					String text = driver.findElement(By.xpath("(//tbody)[1]//tr[" + i + "]/td[" + j + "]")).getText(); // runtime
																														// xpath
					System.out.print(" " + text);
				}

			System.out.println();
		}

	}
}
