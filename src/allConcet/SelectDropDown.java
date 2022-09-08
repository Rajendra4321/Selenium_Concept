package allConcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)", "true");
	   
	   WebElement sel = driver.findElement(By.xpath("//select[@id='speed']"));
	      
	   Select s=new Select(sel);
         	   
	   s.selectByIndex(3);
	  
	 System.out.println(s.getFirstSelectedOption()); 
	
}
}
