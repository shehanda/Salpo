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

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

import pageobjects.*;
import pageobjects.SalpoObjects.Salpo;

import comman.*;





  public class VerifyResultsNavigation extends Environmentsetup 
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
			
			//driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/main/article[1]/div/header/h2/a")).click();
			SalpoObjects.Salpo.first_result(driver).click();
			Thread.sleep(5000);
			
			if(SalpoObjects.Salpo.image(driver).isDisplayed())
			{	
				System.out.println("Navigated successfully");
			}
			else
			{
				System.out.println("Navigation failed");
			}	
		
			
			
		}
		
		

		@AfterTest
		public void quit()
		{
			driver.quit();
		}



		
	}


