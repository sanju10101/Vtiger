package sere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hybrid_Data_Keyword.BaseTest;

public class Sere extends BaseTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
   BaseTest bt = new BaseTest();
   bt.openBrowser();
   WebElement untb = driver.findElement(By.id("username"));
   driver.navigate().refresh();
   untb.sendKeys("admin");
	}

}
