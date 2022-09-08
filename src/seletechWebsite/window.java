package seletechWebsite;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/");

		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		
		Set<String> allIDS = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIDS);
   
		// switch to child window
		driver.switchTo().window(al.get(1));

		// click on training link from child window
		driver.findElement(By.xpath("//a[text()='Practice']")).click();

		Thread.sleep(3000);

		// switch to main page
		driver.switchTo().window(al.get(0));

		Thread.sleep(3000);

		// click on new window btn from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	}
}
