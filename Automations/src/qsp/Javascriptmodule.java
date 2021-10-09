package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Javascriptmodule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
      //  JavascriptExecutor jse= (JavascriptExecutor)driver;
      //  jse.executeScript("window.scrollBy(0,1000)");
       WebElement sponser=driver.findElement(By.xpath("//p[@class='card-text w-lg-75']"));
       Point loc = sponser.getLocation();//get location is abstract method9web element)
        System.out.println(loc);
        RemoteWebDriver rwd = (RemoteWebDriver)driver;
        rwd.executeScript("window.scrollBy"+loc);
        }
	

}
