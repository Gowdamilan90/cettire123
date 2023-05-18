package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SalePage 
{
	public WebDriver driver;

	public SalePage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="navBarLink4")   
	public WebElement sale;
	
	@FindBy(linkText="Men's Clothing")
	public WebElement men;
	
	
	@FindBy(xpath="//h4[@class='_1hpCuT-_tNLtqtdkEEP5Kt']")
	public WebElement category;
	
	@FindBy(xpath="//div[@class='_3eYRPpqrrM1gk1HXB0zVp-']/div[5]")
	public WebElement jeans;
	
	@FindBy(xpath="//h4[@class='SpWX_QzZqZMME1g7aAVbM']")
	public WebElement size;
	
	@FindBy(xpath="//div[@class='_3JaJveF-0MmVafARqLwxuZ']/div[5]/i")
	public WebElement select_size;
	
}
