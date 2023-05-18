package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage2 
{
	
	public WebDriver driver;

	public AddtoCartPage2(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='sale']")
	public WebElement sale;
	
	@FindBy(linkText="Gucci")
	public WebElement brand;
	
	@FindBy(xpath="//div[text()='Gucci Run Sneakers']")
	public WebElement GGrunSnkr;
	
	
	//@FindBy(xpath="//div[@class='_39kXPJ614-QYlbwXxD6x0F']")
	//public WebElement size;
//	@FindBy(xpath="//span[text()='Select a size']")
//	public WebElement dropdownSize;

	
	@FindBy(xpath="//div[@class='_5lYri7ps7hX7bYrJcDgMl']/ul/li[10]")
	public WebElement sizebtn;
	
	@FindBy(xpath="//div[@class='_5lYri7ps7hX7bYrJcDgMl']/ul/li[10]/span[1]")
	public WebElement sizeI40;


}	
