package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicdropDownInGoogle {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("driver.chrome.driver","./drivers./chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.google.com/");
          Thread.sleep(5000);
          WebElement ddaddr = driver.findElement(By.name("q"));
          ddaddr.sendKeys("qspiders");
          Thread.sleep(3000);
          ddaddr.sendKeys(Keys.DOWN);
          Thread.sleep(3000);
          ddaddr.sendKeys(Keys.DOWN);
          Thread.sleep(3000);
          ddaddr.sendKeys(Keys.ENTER);
          
	}

}
