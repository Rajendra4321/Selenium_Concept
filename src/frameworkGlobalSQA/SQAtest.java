package frameworkGlobalSQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQAtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_Project_Concept\\BrowserPath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.globalsqa.com/angularjs-protractor-practice-site/#google_vignette");
		
		//ClosePage cp=new ClosePage(driver);
		//cp.closebtn();
		
		HamePage home=new HamePage(driver);
		home.clickOnCalculaterBtn();
		
		Calculater c=new Calculater(driver);
		c.inputA();
		c.inputB();
		Thread.sleep(2000);
		//c.incrementBtn1();
		c.decrementBtn4();

	}

}
