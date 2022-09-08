package login_page_TC;

// link verify  internaly link and extenaly link  this test case

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Internal_and_External_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // lunch the Browser.

		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create account")).click();

		String geturl = driver.getCurrentUrl();
		System.out.println("thuis is url : " + geturl);

		if (geturl.contains("wikipedia.org")) {

			System.out.println("1st Verification: “+ “It is an Internal Link – Passed");

		} else {
			System.out.println("1st Verification: “+ “It is Not an Internal Link – Failed");
		}

		driver.navigate().back();
		driver.findElement(By.partialLinkText("selenium.dev")).click();
		String geturl2 = driver.getCurrentUrl();
		System.out.println(geturl2);

		if (geturl2.contains("selenium.dev")) {
			System.out.println("2nd Verification: “+ “It is an External Link – Passed");
		} else {
			System.out.println("2nd Verification: “+ “It is Not an External Link – Failed");
		}
		driver.quit();
	}

}
