package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttimelogin {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MY-PC.DESKTOP-CB3S4U6\\automationz\\Automations\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.actitime.com/demo-request");
	String  actualtitle = driver.getTitle();
	String expectedtitle ="Request Demo of actiTIME";
	if(actualtitle.equals(expectedtitle)) {
		System.out.println("demo page is displayed");
	}
	else {
		System.out.println("not dispay");
		}
	
}

}
