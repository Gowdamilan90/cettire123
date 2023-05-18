package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalePageMenBg 
{

	public WebDriver driver;
	

	public SalePageMenBg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	
	
	
	@FindBy(xpath="//a[@id='navBarLink4']")
	WebElement sale;
	
	@FindBy(xpath="//a[@class='_1dalU31C1yPXDRHYzBbBHw']")
	WebElement sale1;

	@FindBy(linkText="Men's Bags")
	//@FindBy(xpath="//a[normalize-space()='Men']")
	WebElement MensBgSale;
	
	@FindBy(xpath="//h4[@class='-vyrgehLo5g04D_RIYDgF'][text()='Color']")
	WebElement color;
	
	@FindBy(xpath="//div[4]/i[@class='_27WOzxgIGZt7Xh7VpbHjUc']") //div[@class='_22N4-z7hsJeDHheDCtIYd1']/div[1]/div[4]") //div[@class='_22N4-z7hsJeDHheDCtIYd1']/div[1]/div[13]/i[1]")
	WebElement color_box;
	
	
	
	public void select_mensSaleBag()
	{
		Actions act= new Actions(driver);
		act.moveToElement(sale).build().perform();
		act.moveToElement(sale1).build().perform();
		act.moveToElement(MensBgSale).click().perform();
	}
	
	public void select_color() throws InterruptedException
	{
		
		
		
		Thread.sleep(Duration.ofSeconds(3));
		Actions act= new Actions(driver);
		
		act.moveToElement(color).click().perform();		
		color_box.click();
	}
	
	
	

}
