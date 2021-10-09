package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders {
	public static void main(String args[]) {
		System.setProperty("driver.chrome.driver","./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement addr=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		addr.sendKeys("Qspiders hyderabad");
		addr.sendKeys(Keys.ENTER);
	}

}
