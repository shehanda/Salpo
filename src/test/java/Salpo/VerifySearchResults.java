package Salpo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.*;
import comman.*;





  public class VerifySearchResults extends Environmentsetup 
  {
	  
	  	
	  	WebDriver driver;
		WebDriverWait wait;
		
		
		@Parameters("browser")
	  	@BeforeClass
	  	
	  	public void setupEnv(String browser)
	  	{
			driver = beforeTest(browser);
		}
		
		@Test
		public void loadUrl() throws Exception
		{
			HomePage();
			Thread.sleep(5000);
			SalpoObjects.Salpo.Search_button(driver).click();
			
			SalpoObjects.Salpo.search_textbox(driver).sendKeys("crm"); 
			Thread.sleep(5000);
			
			
			SalpoObjects.Salpo.search_click(driver).click();
			Thread.sleep(5000);
			
			String searchtxt = SalpoObjects.Salpo.search_results(driver).getText();
			
			Thread.sleep(5000);
			String[] actual = searchtxt.split(" ");
			int actualresult = Integer.parseInt(actual[0]);
			
			if(10 < actualresult)
			{
				System.out.println("Search results are more than 10");
			}
			
			else
			{
				System.out.println("Search results are less than 10");
			}
			
			
			
		}
		
		@AfterTest
		public void quit()
		{
			driver.quit();
		}



		
	}


