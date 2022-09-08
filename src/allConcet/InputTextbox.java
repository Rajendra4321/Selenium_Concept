package allConcet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTextbox {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
         input.sendKeys("Google");
         
         driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
         
         List<WebElement> captureSeachText = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
         
         for(WebElement textElement : captureSeachText) {
        	 
        	 System.out.println(textElement.getText());
         }
	}

}
