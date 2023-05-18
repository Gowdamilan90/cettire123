package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage 
{

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		//this.driver= driver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Sign In\"]")    //linkText
	WebElement SignInlink;
	
//	@FindBy(linkText="Sign In")
//	WebElement SignInlink;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//div[@id='slidedown-footer']/button[2]")
	WebElement Allow_button;
	
	
	
	
	
	public void click_signinLink()
	
	{
		SignInlink.click();
	}
	
	
	public void setusername(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void click_submit()
	{
		SubmitBtn.click(); 
	}
	
	public void click_Allow()
	{
		Allow_button.click();
	}
	
	

}
