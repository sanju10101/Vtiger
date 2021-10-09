package hybrid_Data_Keyword;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
       BaseTest bt = new BaseTest();
       bt.openBrowser();
       FileLib flib = new FileLib();
      String un= flib.readPropertyData(PROP_PATH, "username");
       String pwd=flib.readPropertyData(PROP_PATH, "password");
       driver.findElement(By.id("username")).sendKeys(un);
       driver.findElement(By.name("pwd")).sendKeys(pwd);
       driver.findElement(By.xpath("//div[text()='Login ']")).click();
       
       WebDriverCommonLib wlib=new WebDriverCommonLib();
       wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
       wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Enter Time Track Page");
       
	}

}
