package testCase;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.AddtoCartPage;
import pageObject.OpenNewTabRightClickPage;
import testBase.BaseClass;

public class Test_OpenNewTabRightClick extends BaseClass

{

	//@Test(priority=0)
	public void SaleTest() 
	{
		OpenNewTabRightClickPage RghtClickPge= new OpenNewTabRightClickPage(driver); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions act= new Actions(driver);
		
		act.contextClick(RghtClickPge.Cettire).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	
	}
	
	
	@Test(priority=1)

	public void ScrollWPbyUnit_Test() 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	
		
	}
	
	
	
	
	
	
	
}
