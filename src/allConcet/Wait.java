package allConcet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	 public static void sendKeys(WebDriver driver1, WebElement element, Duration timeout, String value)
	 
	{
		 new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		 element.sendKeys(value);
		 }
		
	 public static void clickOn(WebDriver driver1, WebElement element, Duration timeout)
		 
		 {
		 new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		 element.click();
		}
	
	
	
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.hrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
			WebDriver  driver = new ChromeDriver();
			
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 WebElement firstname= driver.findElement(By.name("firstname"));
	 WebElement lastname= driver.findElement(By.name("lastname"));
	 sendKeys(driver, firstname, Duration.ofSeconds(10),"Edureka");
	 sendKeys(driver, firstname, Duration.ofSeconds(10),"Edureka");
	 WebElement forgotAccount= driver.findElement(By.linkText("Forgotten account?"));
	 clickOn(driver,forgotAccount, Duration.ofSeconds(10));
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	
}