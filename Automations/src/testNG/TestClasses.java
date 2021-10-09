package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClasses {
	@Test(priority=1)
	public void run() {
		Reporter.log("run", true);
	}
	@Test(priority=2,enabled = false)
	public void bun() {
		Reporter.log("bun", true);
	}
	@Test(priority=3,enabled = true,invocationCount = 5)
	public void gun()
	{
		Reporter.log("gun", true);
	}

}
