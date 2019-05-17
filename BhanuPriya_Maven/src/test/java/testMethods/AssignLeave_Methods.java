package testMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AssignLeave_Methods {

	WebDriver aldriver;
	
	public AssignLeave_Methods(WebDriver rdriver)
	{
		aldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@id='menu_leave_viewLeaveModule']/b")
	@CacheLookup
	public
	WebElement leave;
	
	//a[@id='menu_leave_assignLeave']
	
	@FindBy(how=How.XPATH, using="//a[@id='menu_leave_assignLeave']")
	@CacheLookup
	public
	WebElement assignleave;
}
