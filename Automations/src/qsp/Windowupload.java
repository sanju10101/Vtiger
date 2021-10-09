package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowupload {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.monsterindia.com/");
    driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\Downloads\\newbrowser");

	}

}
