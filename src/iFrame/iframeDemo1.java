package iFrame;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDemo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
           driver.get("https://the-internet.herokuapp.com/");

             driver.findElement(By.xpath("//a[text()='Frames']")).click();
           
           
        // driver.switchTo().frame(driver.findElement(By.xpath("//a[normalize-space()='iFrame']")));
           
           driver.findElement( By.xpath("//a[text()='iFrames']")).click();
         
           //driver.switchTo().parentFrame();   //main page 
}
}