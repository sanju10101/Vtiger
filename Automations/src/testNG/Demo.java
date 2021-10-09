package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run() {
	//	System.out.println("Hello");
		Reporter.log("hello");
		Reporter.log("chai");
		Reporter.log("demo", true);
		}
	}
