package qsp;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class runtimepoly {

	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		// TODO Auto-generated method stub
         System.out.println("enter any value");
         Scanner sc= new Scanner(System.in);
         String browsername=sc.next();
         if(browsername.equals("chrome"))
         {
        	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        	driver =new ChromeDriver();
         }
         
         else if(browsername.equals("firefox")){
        	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
     		driver= new FirefoxDriver();
         }
         
         else {
        	 System.out.println("dabba Fellow insert correctly");
         }
	}
        
	

}
