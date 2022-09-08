package seletechWebsite;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SliderBar {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", true);
	    
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        int width=slider.getSize().getWidth();
        System.out.println(width);
        
        Actions act =new Actions(driver);
        act.dragAndDropBy(slider, 0,((width*2)/50)).build().perform();
		System.out.println("Slider moved");
        
	}
}