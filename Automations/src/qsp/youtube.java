package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
        WebElement addr=driver.findElement(By.xpath("//input[@name='search_query']"));
        addr.sendKeys("buttabomma davidwarner");
        Thread.sleep(5000);
        addr.sendKeys(Keys.ENTER);
     WebElement addrs=  driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and @aria-label='#ButtaBomma ft. David Warner and Candice Warner | ButtaBomma | SunRisers Hyderabad | SRH by SunrisersIPL 1 year ago 13 seconds 2,361,930 views']"));
    // WebElement addrs = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),' Candice Warner')"];     
    		 Thread.sleep(3000);
     addr.sendKeys(Keys.ENTER);
              
        
        
           
				
	}

}
