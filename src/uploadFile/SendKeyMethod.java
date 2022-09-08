package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularjs-protractor-practice-site/");
		driver.findElement(By.xpath("((//div[@class='price_column '])[2]//li)[3]")).click();
		//driver.findElement(By.tagName("input")).sendKeys("C:\\Users\\HP\\Desktop\\New folder\\tree.jpg");
		;

	}
}