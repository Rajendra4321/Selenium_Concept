package allConcet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTextMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)", true);
		
		List<WebElement> txt = driver.findElements(By.xpath("(//div[contains(@class,'widget-content')])[4]//span"));
       for (WebElement txtElement : txt) {
		System.out.println(txtElement.getText());
	}
	}

}
