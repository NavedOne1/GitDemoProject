package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPage;


public class GoogleSearchTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/NAVED ALI/Downloads/chromedriver_win32/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		GoogleSearchPage.textbox_search(driver).sendKeys("What is Page Object Model ?");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
	}

}
