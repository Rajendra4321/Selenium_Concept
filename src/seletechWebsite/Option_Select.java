package seletechWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/");

		driver.findElement(By.xpath("//a[text()='Practice']")).click();

		WebElement btn3 = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		btn3.click();
		Select s1 = new Select(btn3);

		s1.selectByIndex(2);
		//input[@id='checkBoxOption1']
	}

}
