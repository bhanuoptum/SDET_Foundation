package testScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import testMethods.Login_Methods;

public class LoginPage_Validation extends BaseClass{

	/* This Method to validate Login page */
	@Test(enabled = false)
	public void Login_Test() throws InterruptedException {
		Login_Methods lm = new Login_Methods(driver);
		System.out.println("Before Test");
		lm.setUserName(username);
		lm.setPassword(password);
		lm.clickSubmit();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
				}
	
}
	
	
	
	
	

