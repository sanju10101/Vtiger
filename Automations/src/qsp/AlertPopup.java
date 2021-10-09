package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.getText();
		al.sendKeys("");
		

	}

}
