package allConcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement dragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropEle = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act =new Actions(driver);
		
		act.dragAndDrop(dragEle, dropEle).build().perform();
	}

}
