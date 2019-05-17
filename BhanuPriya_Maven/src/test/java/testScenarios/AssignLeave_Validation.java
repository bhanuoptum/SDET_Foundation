package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testMethods.AssignLeave_Methods;

public class AssignLeave_Validation extends BaseClass{
	
	AssignLeave_Methods alm = new AssignLeave_Methods(driver);
	
	
  @Test
  public void f() {
 	  Actions action = new Actions(driver);	  
      action.moveToElement(alm.leave).build().perform();
      alm.assignleave.click();
      Assert.assertEquals("Assign Leave", driver.findElement(By.xpath("/h1[contains(text(),'Assign Leave')]")).getText());
//Employee name=    //input[@id='assignleave_txtEmployee_empName']
      //Leave Type = //select[@id='assignleave_txtLeaveType']
      //from date = //input[@id='assignleave_txtFromDate']
      //To date = //input[@id='assignleave_txtToDate']
      //duartion //select[@id='assignleave_duration_duration']
      //assing = //input[@id='assignBtn']

	  
  }
}
