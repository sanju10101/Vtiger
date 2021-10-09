package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallelExec {
	public static WebDriver driver;
	@Parameters("browser")
	@Test
	public void openBrowser(String Browsername) {
		if(Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("give proper name");
		}
	}

}
