package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingMouseAndKeyBoardAction {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//button[text()='✕']")).click();
       Thread.sleep(3000);
    //  WebElement moreaddr= driver.findElement(By.xpath("//div[text()='More']"));
     //  Actions ac = new Actions(driver);
     //  ac.moveToElement(moreaddr).perform();
       driver.findElement(By.xpath("//a[text()='Login']")).click();
       WebElement untb = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
       untb.sendKeys("9515100000");
       Actions a = new Actions(driver);
       a.doubleClick(untb).perform();
       
     
	}

}
