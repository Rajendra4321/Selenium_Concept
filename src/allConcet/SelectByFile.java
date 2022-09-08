package allConcet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		((JavascriptExecutor) driver).executeScript("window.scrollBy (0,500)", true);

		WebElement sel = driver.findElement(By.xpath("//select[@id='files']"));

		Select fileSel = new Select(sel);
		Thread.sleep(2000);
		fileSel.selectByIndex(2);
		WebElement text = fileSel.getFirstSelectedOption();
		System.out.println(text.getText());
    
		 Thread.sleep(2000);
		WebElement selnumber = driver.findElement(By.xpath("//select[@id='number']"));

		Select numSel = new Select(selnumber);
		Thread.sleep(2000);
		numSel.selectByIndex(2);
		WebElement text1 = numSel.getFirstSelectedOption();
		System.out.println(text1.getText());
		
		Thread.sleep(2000);
		WebElement selProduct = driver.findElement(By.xpath("//select[@id='products']"));
		Select selpro = new Select(selProduct);
		Thread.sleep(2000);
		selpro.selectByIndex(2);

		Thread.sleep(2000);
		WebElement selAnimal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select selam = new Select(selAnimal);
		Thread.sleep(2000);
		selam.selectByIndex(2);

	}

}
