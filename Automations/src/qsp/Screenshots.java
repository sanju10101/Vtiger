package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	System.setProperty("driver.chrome.driver","./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src= rwd.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\Documents\\OneNote Notebooks\\Personal Notebook\\screenshot\\\\googlephoto.jpg");
		Files.copy(src,desc);
	/*	System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\Documents\\OneNote Notebooks\\Personal Notebook\\screenshot\\googlyphoto.png");
		Files.copy(src, dest);
			}*/
	/*	System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		File src= ef.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\Documents\\OneNote Notebooks\\Personal Notebook\\screenshot\\goli.jpg");
		Files.copy(src, desc);
	}*/
		/*WebElement addr=driver.findElement(By.xpath("//img[@alt='Google']"));
		File src=addr.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\Documents\\OneNote Notebooks\\Personal Notebook\\screenshot\\googlylogoo.jpg");
		Files.copy(src, desc);		*/
	}
}
		


