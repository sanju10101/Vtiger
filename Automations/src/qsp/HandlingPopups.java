package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\automationz\\Automations\\drivers\\chromedriver.exe");
		driver.get("https://www.google.com/");
	  WebElement addr=   driver.findElement(By.xpath("//input[@name='q']"));
		addr.sendKeys("qspider");
		addr.sendKeys(Keys.DOWN);
		
	}

}
