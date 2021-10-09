package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
	@Test
	public void verify() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		//driver.get("https://demo.actitime.com/login.do");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Login");
		driver.findElement(By.id("username")).sendKeys("admin");
		sa.assertAll();
		
	}

}
