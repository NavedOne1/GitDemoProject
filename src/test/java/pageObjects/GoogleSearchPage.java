package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement Element = null;
public static WebElement textbox_search(WebDriver driver) {
	
	Element = driver.findElement(By.name("q"));
	return Element;
}

public static WebElement button_search(WebDriver driver) {
	
	Element =driver.findElement(By.name("btnK"));
	return Element;
}


    
	
	
	
	
	
	
	
	
	
	
}


