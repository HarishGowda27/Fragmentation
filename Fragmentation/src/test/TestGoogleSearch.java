package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglesearchPage;

public class TestGoogleSearch {
	
	static WebDriver driver = null; 
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	GooglesearchPage.textbox_search(driver).sendKeys("google");
	
	GooglesearchPage.textbox_search(driver).click();
	
	}
}
