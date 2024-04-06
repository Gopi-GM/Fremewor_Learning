package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();
	public void verifyIfLoginPageLoaded()
	{
		//Assert.assertTrue(ele.getWebElement("XPATH", LoginPageElements.LoginText).size(0), "Element not Found");
	}
	
	public void enterCredentials()
	{
		ele.getWebElement("XPATH", LoginPageElements.EmailAddress).sendKeys("gopi@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.PasswordField).sendKeys("1234");
		
	}

}
