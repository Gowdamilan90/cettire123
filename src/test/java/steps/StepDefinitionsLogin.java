package steps;

import java.time.Duration;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;

public class StepDefinitionsLogin 
{
	WebDriver driver;
	//public ResourceBundle rb;
	
	@Given("I launch Chrome browser")
	public void open_ChromeBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
	}

	@And("open Cettire HomePage")
	public void openCettire_homePage() 
	{
		//Loading properties file:\
		//rb= ResourceBundle.getBundle("config");
		
		
		//driver.get(rb.getString("appURL"));
		driver.get("https://www.cettire.com/ca");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@And("click the signIn_Link on top right corner")
	public void click_sign_in_link_ontop() 
	{
		HomePage LgnPge=new HomePage(driver);
		LgnPge.click_signinLink();
	}

	@When("I enter Username and Password")
	public void enter_UsernamePassword() 
	{
		
		
		driver.findElement(By.id("email")).sendKeys("milangowda1990@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(rb.getString("username"));

		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rb.getString("password"));

		driver.findElement(By.id("password")).sendKeys("CJEPS5576E");
	}

	@And("click on Login button")
	public void click_LoginButton() 
	{
		HomePage LgnPge=new HomePage(driver);
		LgnPge.click_submit();

		
	}

//	@Then("I should be able to go to main page to validate")
//	public void goto_mainPage_to_validate() 
//	{
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

	@Then("close the browser")
	public void closeBrowser()
	{
		driver.quit();
	}

}
