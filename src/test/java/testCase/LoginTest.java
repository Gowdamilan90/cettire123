package testCase;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class LoginTest extends BaseClass

{
	
	
	@Test
	public void loginTest()
	{
		HomePage LgnPge=new HomePage(driver);
		
		LgnPge.click_signinLink();
		
		LgnPge.setusername("milangowda1990@gmail.com");
		LgnPge.setpassword("CJEPS5576E");
		LgnPge.click_submit();

	}

}
