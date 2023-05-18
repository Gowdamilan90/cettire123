package testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.SalePageMenBg;
import testBase.BaseClass;

public class Test_mensSaleBg extends BaseClass
{

	
	@Test(priority=0)
	public void SaleTest() 
	{
		SalePageMenBg sp= new SalePageMenBg(driver);
		sp.select_mensSaleBag();
	
	}
	
	
	@Test(priority=1)
	public void Test_Colordropdwn() throws InterruptedException 
	{
		
		SalePageMenBg sp= new SalePageMenBg(driver);
		sp.select_color();
	}
	

	//@Test(priority=2)
	public void Test_selectColor_Box() throws InterruptedException, IOException
	{
		
		SalePageMenBg sp= new SalePageMenBg(driver);
		
			sp.select_color();
			
			 TakesScreenshot ts= (TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File trg= new File("*/screenShots/screenshot.png");
				FileUtils.copyFile(src,trg);
		
	}
	
	
}
