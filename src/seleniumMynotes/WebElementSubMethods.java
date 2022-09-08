package seleniumMynotes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSubMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// open browser
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean inputUNdisply = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).isDisplayed();
		System.out.println(inputUNdisply);
		
		boolean inputUNselect = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).isSelected();
		System.out.println(inputUNselect);
		
		boolean inputUN = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).isEnabled();
		System.out.println(inputUN);
		
		
	}

}
