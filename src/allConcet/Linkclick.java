package allConcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)", true);
		
		
		
	 //  WebElement link = driver.findElement(By.xpath("//a[text()='Tooltips']"));
		       
		       // link.click();
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("29");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='ThemeRoller']")).click();

	}

}
