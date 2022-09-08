package seletechWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/");
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		WebElement btn1 = driver.findElement(By.xpath("(//input[@class='radioButton'])[2]"));
		 Thread.sleep(2000);
		//berfore select
		System.out.println(btn1.isSelected());
		
		//after click
		btn1.click();
		System.out.println(btn1.isSelected());
		
	 driver.switchTo().window("Switch Window Example");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
	 
		
		
	}

}
