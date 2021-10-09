package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationsInTestNG {
	@BeforeMethod
	public void a() {
	Reporter.log("before method", true);
}
	@AfterMethod
	public void b() {
		Reporter.log("after method", true);
	}
	@BeforeClass
	public void c() {
		Reporter.log("before class", true);
	}
	@AfterClass
	public void d() {
		Reporter.log("after class", true);
	}
	@BeforeTest
	public void e() {
		Reporter.log("before test", true);
	}
	@AfterTest
	public void f() {
		Reporter.log("after test",true);
	}
	@BeforeSuite
	public void g() {
		Reporter.log("before suite", true);
	}
	@AfterSuite
	public void h() {
		Reporter.log("after suite", true);
	}
	}
