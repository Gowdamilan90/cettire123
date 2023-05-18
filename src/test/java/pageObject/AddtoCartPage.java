package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{

	public WebDriver driver;

	public AddtoCartPage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[text()='sale']")
	public WebElement sale;
	
	@FindBy(linkText="Fendi")
	public WebElement brand;
	
	
	//@FindBy(xpath="//div[contains(text(), 'Fendi Roma Lettering Chain Wallet')]")
	@FindBy(xpath="//div[contains (text(), 'Fendi Sunshine Logo Embossed Mini Shoulder Bag')]")
	public WebElement GTot_Bag;
	
	@FindBy(xpath="//button[@id='product-detail--add-cart-button']")
	public WebElement cartBtn;
	
	
	@FindBy(xpath="//span[(text()='Go to Shopping Bag')]")
	public WebElement shpnBagBtn;
	
	@FindBy(xpath="//a[@id='siteHeaderLogoLink']")
	public WebElement homeBtn;

	
	
	
	public void select_greennTotBg()
	{
		Actions act= new Actions(driver);
		act.moveToElement(sale).build().perform();
		act.moveToElement(brand).click().perform();
		GTot_Bag.click();
	}
	
	
	
}
