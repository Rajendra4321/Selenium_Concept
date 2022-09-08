package takeScreenShoot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("C:\\Users\\HP\\Desktop\\New folder\\ScreenShotSelenium\\Demo.jpg");

		FileHandler.copy(src, dest);

//		 driver.get("http://newtours.demoaut.com/");
//		 driver.findElement(By.name("userName")).sendKeys("mercury");
//		 driver.findElement(By.name("password")).sendKeys("mercury");
//		 driver.findElement(By.name("login")).click();
//		 List<WebElement> allitems = driver.findElements(By.xpath("//input[@type='radio']"));
//		 for(WebElement ele:allitems)
//		 {
//		 System.out.println(ele.getAttribute("name"));
//		 }
	}
}
