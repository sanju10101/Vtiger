package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropoption  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/MY-PC.DESKTOP-CB3S4U6/Documents/OneNote%20Notebooks/Personal%20Notebook/dropdown.html");
     WebElement ddaddr = driver.findElement(By.id("novotel"));
     Select sel =  new Select(ddaddr);
     //Thread.sleep(3000);
     //ddaddr.click();
     //sel.selectByVisibleText("idly");
     //sel.selectByValue("b");
     //sel.selectByIndex(5);
     //ddaddr.click();
   /*  if(sel.isMultiple()) {
    	 System.out.println("it is a multi select option");
    	 }
     else {
    	 System.out.println("is a single selec option");
     }
     sel.selectByVisibleText("dosa");
     Thread.sleep(6000);
     sel.deselectByVisibleText("dosa");
     for(int i=0;i<=8;i++) {
    	 sel.selectByIndex(i);
    	 Thread.sleep(1000);
     }
     sel.deselectAll();*/
   List<WebElement> alloptions =sel.getOptions();
    /*  alloptions.size();
     for(int i=0;i<=alloptions.size()-1;i++) {
    	 sel.selectByIndex(i);
    	 Thread.sleep(1000);
     }
     sel.deselectAll(); */
   /*  for(int i=0;i<=alloptions.size()-1;i++) {
    	WebElement oneoption = alloptions.get(i);
    	String text = oneoption.getText();
    	System.out.println(text);
     }*/
  //  for(int i=0;i<=alloptions.size()-1;i++) {
//	 System.out.println(alloptions.get(i).getText());
 //  }
 //  WebElement firstselops = sel.getFirstSelectedOption();
	//   System.out.println(firstselops.getText());
 //  
//  List<WebElement> selops = sel.getAllSelectedOptions();
//  System.out.println(selops.size());
   
//  WebElement wrapelem = sel.getWrappedElement();
//  System.out.println("wrapelem.getText()"); 
   
 // HashSet<String> alltext = new HashSet<String>();
 //  for(int i=0;i<=alloptions.size()-1;i++) {
	//   WebElement oneoption =alloptions.get(i);
	//   String text= oneoption.getText();
	  // System.out.println(text);
//	   alltext.add(text);
//   }
//   for(String oneText:alltext) {
	//   System.out.println(oneText);
 //  }
 //  LinkedHashSet<String> alltext = new LinkedHashSet<String>();
 //  for(int i=0;i<=alloptions.size()-1;i++) {
	//   WebElement oneoption = alloptions.get(i);
	//   String text = oneoption.getText();
	//   alltext.add(text);
 //  }
 // for(String oneText:alltext) {
	//  System.out.println(oneText);
 // }
   TreeSet<String> alltext = new TreeSet<String>();
   for(int i=0;i<=alloptions.size()-1;i++) {
	   WebElement oneoption = alloptions.get(i);
	   String text = oneoption.getText();
	   alltext.add(text);
	  }
   for(String oneText:alltext) {
	   System.out.println(oneText);
   }
   
   
   
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}

