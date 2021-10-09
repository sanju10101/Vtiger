package qsp;
//import java.awt.Dimension;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selinium.WebDriver;
//import org.openqa.selinium.chrome.ChromeDriver;
public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.close();
		driver.get("https://www.google.com/");
	      String Url=driver.getCurrentUrl();
	      System.out.println(Url);
		//System.out.println("driver.getsourcepagecode()");
		String srccode=driver.getPageSource();
		if(srccode.contains("google"))
		{
			System.out.println("google is present");
		}
		else{
			System.out.println("not present");
		}
		String title=driver.getTitle();
		System.out.println("title");
		if(title.equals("google")) {
			System.out.println("google page is displayed");
			
		}
		else {
			System.out.println("not dislayed");
			}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();		
	}

	
	

}
