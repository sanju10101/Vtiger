package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MY-PC.DESKTOP-CB3S4U6\\\\automationz\\\\Automations\\\\drivers\\\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("file:///C:/Users/MY-PC.DESKTOP-CB3S4U6/Documents/OneNote%20Notebooks/Personal%20Notebook/linkpage.html");
       //driver.findElement(By.id("i1")).click();	
      // driver.findElement(By.name("n1")).click();
     //driver.findElement(By.linkText("Googly")).click();
       driver.findElement(By.partialLinkText("Go")).click();
       
       
       

	
	}

}
