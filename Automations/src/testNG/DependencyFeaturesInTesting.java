package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeaturesInTesting {
	@Test(priority = 2)
	public void transfer1()
	{
		//Assert.fail();
		Reporter.log("successfully transferred1",true);
	}
	@Test(priority = 3)
	public void transfer2()
	{
		//Assert.fail();
		Reporter.log("successfully transferred2",true);
	}
	@Test(priority=1,dependsOnMethods = {"transfer1","transfer2"})
public void delete() {
	Reporter.log("sucessfully deleted", true);
}
}
 