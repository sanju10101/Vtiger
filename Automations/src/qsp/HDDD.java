package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HDDD {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.cleartrip.com/");
       Thread.sleep(2000);
       String xp="//h4[text()='From']/..//input[@placeholder='Any worldwide city or airport']";
         WebElement ddaddr = driver.findElement(By.xpath(xp));
         ddaddr.sendKeys("del");
         Thread.sleep(2000);
      //   Select sel = new Select(ddaddr);
      //   List<WebElement> alloptions = sel.getOptions(); //static dropdown
       //  System.out.println(alloptions.size());
         Thread.sleep(5000);
         List<WebElement> alloptions = driver.findElements(By.xpath("//p[contains(@class,'to-ellipsis ') and contains(text(),'el')]"));
         {
         System.out.println(alloptions.size());//dynamic dropdown
         }
         for(int i=0;i<alloptions.size()-1;i++) {
        	 System.out.println(alloptions.get(i).getText());
         }
         alloptions.get(alloptions.size()-1).click();
         
	}

}
