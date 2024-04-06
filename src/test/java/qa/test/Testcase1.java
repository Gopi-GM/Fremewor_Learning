package qa.test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage= new LoginPageEvents();
  @Test
  public void samplemethod() 
  {
	  homePage.signInButton();
	  loginPage.verifyIfLoginPageLoaded();
	  loginPage.enterCredentials();
  }
}
