package testCase;
 import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.SalePage;
import testBase.BaseClass;

public class SaleTest extends BaseClass
{
	@Test(priority=0)
	public void SaleTest() throws InterruptedException
	{
		SalePage sp= new SalePage(driver); 
		Actions act= new Actions(driver);
		act.moveToElement(sp.sale).build().perform();
		act.moveToElement(sp.men).click().perform();
	
	}

	
	@Test(priority=1)
	public void TestJeans() throws InterruptedException 
	{
		SalePage sp= new SalePage(driver); 
		Actions act= new Actions(driver);
		Thread.sleep(15);
		act.moveToElement(sp.category).click().perform();
		act.moveToElement(sp.jeans).click().perform();
		//act.moveToElement(sp.category).click().perform();
		
		
		
	
	}
	
	@Test(priority=2)
	public void TestSize() throws InterruptedException, IOException
	{
	
		Thread.sleep(10);
		SalePage sp= new SalePage(driver); 
		Actions act= new Actions(driver);
		act.moveToElement(sp.size).click().perform();
		
		sp.select_size.click();
		
		//act.moveToElement(sp.size).click().perform();
		
		
		
	
	}
	

}
