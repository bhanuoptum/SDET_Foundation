package testScenarios;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import testUtilities.ReadConfig;


public class BaseClass{
	
		ReadConfig readconfig=new ReadConfig();
		
		public String baseURL=readconfig.getApplicationURL();
		public String username=readconfig.getUsername();
		public String password=readconfig.getPassword();
		public String empname=readconfig.getEmpName();
		public String adminname=readconfig.getAdminName();
		 public static WebDriver driver ;
		 public static WebDriverWait wait;
		
		 
			
		@BeforeClass
		public void setUp() throws InterruptedException
		{			
			System.out.println("Before Class");
				/*System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();*/
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 			capabilities.setCapability("marionette", true);
	 			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
	 			driver = new FirefoxDriver(capabilities);
	 			driver.manage().window().maximize();
	 		
	 			driver.get(baseURL);
		 			Thread.sleep(3000);
			
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		
	}


