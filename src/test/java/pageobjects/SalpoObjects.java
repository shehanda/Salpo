package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalpoObjects 
{
	
	public static class Salpo
	{
		
		private static WebElement element = null;
		 
		 
		//-----------------------------buttons-------------------------------------------------------------------//
		
		 public static WebElement Search_button(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.xpath(".//*[@id='menu-item-search']/a"));
			 return element;
		 
		 }
		 
		 public static WebElement search_click(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.id("searchsubmit"));
			 return element;
		 
		 }
		 
		 
		 
		 
	
		 
//-----------------------------textboxes-------------------------------------------------------------------//	 
		 
		 public static WebElement search_textbox(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.xpath(".//*[@id='s']"));
			 return element;
		 
		 }
		 
		 
		 
//---------------------------labels-----------------------------------------------------------------//	 
		 
		 public static WebElement search_results(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/main/h4"));
			 return element;
		 
		 }
		 

		 
//---------------------------search results--------------------------------------------------------//
		 
		 public static WebElement first_result(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/main/article[1]/div/header/h2/a"));
			 return element;
		 
		 }
		 
		 
		 //--------------------image--------------------------------------------------------------//
		 
		 public static WebElement image(WebDriver driver)
		 {
		 
			 element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/main/article/div[2]/header/div/p[1]/img"));
			 return element;
		 
		 }
		 
		 
		 
	}
	
	

}
