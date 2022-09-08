package seletechWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_mutiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/");

		driver.findElement(By.xpath("//a[text()='Practice']")).click();

	
		
		WebElement btn2 = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select s =new Select(btn2);
		
		s.selectByIndex(2);
		s.selectByIndex(0);
		
		if (s.isMultiple()) {
			System.err.println("this is select multiple");
		}
		
	}

}
