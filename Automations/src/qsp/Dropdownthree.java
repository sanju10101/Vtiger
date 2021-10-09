package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dropdownthree {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
      Thread.sleep(2000);
      WebElement src = driver.findElement(By.id("box2"));
      WebElement dest = driver.findElement(By.id("box102"));
      Actions ac = new Actions(driver);
      ac.dragAndDrop(src, dest).perform();
      }

}
