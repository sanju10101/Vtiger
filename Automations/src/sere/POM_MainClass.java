package sere;

import hybrid_Data_Keyword.BaseTest;

public class POM_MainClass extends BaseTest{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     BaseTest bt = new BaseTest();
     bt.openBrowser();
     LoginPage lp = new LoginPage();
     driver.navigate().refresh();
     lp.getuntb().sendKeys("admin");     
	}

}
