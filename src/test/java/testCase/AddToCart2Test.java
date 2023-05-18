package testCase;

import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.AddtoCartPage;
import pageObject.AddtoCartPage2;
import testBase.BaseClass;

public class AddToCart2Test extends BaseClass
{

	@Test(priority=0)
	public void SaleTest() 
	{
		AddtoCartPage2 acp2= new AddtoCartPage2(driver); 
		Actions act= new Actions(driver);
		act.moveToElement(acp2.sale).build().perform();
		act.moveToElement(acp2.brand).click().perform();
		//act.moveToElement(acp2.sale).moveToElement(acp2.brand).click().perform();
	
	}
	
	
	@Test(priority=1)
	public void pickbag() 
	{
		AddtoCartPage2 acp2= new AddtoCartPage2(driver); 
		acp2.GGrunSnkr.click();
		acp2.sizebtn.click();
		acp2.sizeI40.click();
		//WebElement dropdownElement = driver.findElement(By.id("cmVhY3Rpb24vcHJvZHVjdDpURWt2ZDZqTnlmS1J0R3JXQQ=="));
		//Select dropdown = new Select(dropdownElement);
		

		//dropdown.selectByIndex(10);
		//dropdown.selectByValue("IT40");
		
	//acp2.sizebtn.click();
		
		
		
	
	}
	
	@Test(priority=2)
	public void Test_AddtoCart() throws InterruptedException 
	{
		AddtoCartPage acp= new AddtoCartPage(driver); 
		
		acp.cartBtn.click();
		Thread.sleep(10);
	
	}
	
	@Test(priority=3)
	public void Test_ShppnBag() throws InterruptedException 
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
		
		 Thread.sleep(10);
		acp.homeBtn.click();
	
	}
}
