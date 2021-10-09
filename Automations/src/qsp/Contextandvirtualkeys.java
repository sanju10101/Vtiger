package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextandvirtualkeys {
//performing rightclick
	public static void main(String[] args) throws InterruptedException, AWTException  {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MY-PC.DESKTOP-CB3S4U6\\\\automationz\\\\Automations\\\\drivers\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("file:///C:/Users/MY-PC.DESKTOP-CB3S4U6/Documents/OneNote%20Notebooks/Personal%20Notebook/linkpage.html");
          WebElement link=driver.findElement(By.id("i1"));
          Actions ac = new Actions(driver);
          ac.contextClick(link).perform();
          Thread.sleep(3000);
          Robot r = new Robot();
          r.keyPress(KeyEvent.VK_T);
          r.keyRelease(KeyEvent.VK_T);
	}
	}
