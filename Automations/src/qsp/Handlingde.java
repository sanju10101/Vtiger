package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handlingde {
public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/MY-PC.DESKTOP-CB3S4U6/Documents/OneNote%20Notebooks/Personal%20Notebook/disabledelement.html");
       driver.findElement(By.id("i1")).sendKeys("admin");
   //    driver.findElement(By.id("i2")).sendKeys("manager");
       WebElement pwtb = driver.findElement(By.id("i2"));
       if(pwtb.isEnabled()) {
    	   System.out.println("pwtb is enabled");
    	   driver.findElement(By.id("i2")).sendKeys("manager");
       }
       else
       {
    	   System.out.println("pwtb is disable");
    	   JavascriptExecutor jse = (JavascriptExecutor)driver;
    	   jse.executeScript("document.getElementById('i2').value='manager'");
       }
       
}

}
