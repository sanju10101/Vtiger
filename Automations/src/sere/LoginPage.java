package sere;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hybrid_Data_Keyword.BaseTest;

public class LoginPage  {
@FindBy(id="username")private WebElement untb;
public LoginPage() {
	PageFactory.initElements(BaseTest.driver, this);;
}
public WebElement getuntb() {
	return untb;
}
//public void setuntb(String un) {
	//untb.sendKeys(un);
//}
}