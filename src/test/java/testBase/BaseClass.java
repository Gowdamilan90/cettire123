package testBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;

public class BaseClass 
{
	
	
		public WebDriver driver;
		public ResourceBundle rb; // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Using for loading properties************************

// https://github.com/Gowdamilan90/cettire123.git
		
		
		@BeforeClass
		//@Parameters({"browser"})
		//public void setup(String br) throws InterruptedException
		public void setup() throws InterruptedException
		{
			//Loading properties file:\
			rb= ResourceBundle.getBundle("config");
			
			
			
			/*if (br.equals("chrome")) 
			{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			}
			
			else if (br.equals("firefox"))
			{	
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			else if (br.equals("edge"))
				
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				
			}*/
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//			driver.get("https://www.cettire.com/ca");
			
			driver.get(rb.getString("appURL"));  //>>>>>>>>>>>>>>>>>>>>> reading data from config.properties file
			driver.manage().window().maximize();
			
			HomePage LgnPge=new HomePage(driver);
			LgnPge.click_signinLink();
			
//			LgnPge.setusername("milangowda1990@gmail.com");
//			LgnPge.setpassword("CJEPS5576E");
			
			LgnPge.setusername(rb.getString("username")); //>>>>>>>>>>>>>>>>>>>>> reading data from config.properties file
			LgnPge.setpassword(rb.getString("password")); //>>>>>>>>>>>>>>>>>>>>> reading data from config.properties file
			
			
			LgnPge.click_submit();
			
			Thread.sleep(Duration.ofSeconds(10));
			
			//only for FireFox
			//LgnPge.click_Allow();
		}


		
		@AfterClass
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(Duration.ofSeconds(5));
			driver.quit();

		}
	


}
