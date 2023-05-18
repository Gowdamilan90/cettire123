package testCase;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObject.AddtoCartPage;
import pageObject.SalePage;
import testBase.BaseClass;


public class AddToCartTest extends BaseClass
{

	@Test(priority=0)
	public void SaleTest() 
	{
		AddtoCartPage acp= new AddtoCartPage(driver); 
		acp.select_greennTotBg();
		
	
	}
	
	
//	@Test(priority=1)
//	public void pickbag() 
//	{
//		AddtoCartPage acp= new AddtoCartPage(driver); 
//		acp.GTot_Bag.click();
//	
//	}
	
	
	@Test(priority=2)
	public void Test_AddtoCart() throws InterruptedException 
	{
		AddtoCartPage acp= new AddtoCartPage(driver); 
		
		acp.cartBtn.click();
		Thread.sleep(10);
	
	}
	
	@Test(priority=3)
	public void Test_ShppnBag() throws InterruptedException, IOException 
	{
		 AddtoCartPage acp= new AddtoCartPage(driver); 


		 try {
			
			 acp.shpnBagBtn.click();
	        } 
		 catch (NoSuchElementException e) 
		 {
	            System.out.println("Element not found: " + e.getMessage());
	            // Handle the exception here
	      }
		
		 TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg= new File("*/screenShots/screenshot.png");
			FileUtils.copyFile(src,trg);
			
		 Thread.sleep(10);
		acp.homeBtn.click();
	
	}
	
	


	
}
	
	
	


