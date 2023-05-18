package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewTabRightClickPage 
{
	
	
	public WebDriver driver;
	
	public OpenNewTabRightClickPage (WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//a[@id='account']")
	public WebElement Cettire;
	
	@FindBy(xpath="//a[@id='popularSection1']/div[2]")
	public WebElement MensCollection;
	

}
