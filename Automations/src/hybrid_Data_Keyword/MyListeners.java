package hybrid_Data_Keyword;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"started", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log(result.getName()+"methodstarted", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log(result.getName()+"methodsucess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	Reporter.log(result.getName()+"methodfail",true);
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	wlib.getFullPageScreenshot("./screenshots/"+result.getName()+"./png");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"methodskipped", true);
	}

	

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"finished", true);
	}
	

}
