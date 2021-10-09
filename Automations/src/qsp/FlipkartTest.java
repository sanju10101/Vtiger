package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//button[text()='✕']")).click();
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
     //  Thread.sleep(200000);
       //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
       WebDriverWait wait = new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
       driver.findElement(By.xpath("//span[text()='Login']")).click();
        
}

}
