package comman;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageobjects.*;

public class Environmentsetup {
	
	
	WebDriver driver;
	public WebDriver beforeTest(String browser) 
	{
		

		/*if(browser.equalsIgnoreCase("firefox")) 
		{

			driver = new FirefoxDriver();  

		}*/
		/*if (browser.equalsIgnoreCase("ie")) 
		{ 

			System.setProperty("webdriver.ie.driver", "D:\\Browser drivers\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		} */
		if (browser.equalsIgnoreCase("chrome")) 
		{ 

			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			                  
			driver = new ChromeDriver();

		}
		

		
		return driver;
		
	}
	
	
	public void HomePage() 
	{
		driver.get("https://www.salpo.com");
		driver.manage().window().maximize();
	}
	
	
	
	
	
}
