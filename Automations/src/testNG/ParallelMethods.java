package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethods {
	@Test
public void runChrome1() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
}
	@Test
public void runChrome2() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
}
	@Test
public void runChrome3() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
}

}
