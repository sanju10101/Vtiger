package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartmobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\automationz\\Automations\\driverz\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\automationz\\Automations\\driverz\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement addr=driver.findElement(By.xpath("//input[@class='_3704LK']"));
        addr.sendKeys("laptops");
       addr.click();
        Thread.sleep(5000);   
        /*List<WebElement>alloptions= driver.findElements(By.xpath("//div[contains(@class,'lrtEPN _17d0yO') and contains(text(),'laptops ')]"));
      System.out.println(alloptions.size());
       for(int i=0;i<alloptions.size()-1;i++){
        	System.out.println(alloptions.get(i).getText());
        	//alloptions.get(alloptions.size()-1).click(); 
        	alloptions.get(1).click();*/
        
      
    	 
     }
        
	}  
	



