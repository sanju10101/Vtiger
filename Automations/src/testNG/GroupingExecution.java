package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution {
@Test(groups="SmokeGroup")
public void smoke1() {
	Reporter.log("SmokeTest1", true);
	}
@Test(groups="ftgrp")
public void ft1() {
	Reporter.log("fttest1", true);
}
@Test(groups="SmokeGroup")
public void smoke2() {
	Reporter.log("SmokeTest2", true);
	}
@Test(groups="ftgrp")
public void ft2() {
	Reporter.log("fttest2", true);
}
@Test(groups="itgrp")
public void it1() {
	Reporter.log("ittest1", true);
}
@Test(groups="SmokeGroup")
public void smoke3() {
	Reporter.log("SmokeTest3", true);
	}
@Test(groups="SmokeGroup")
public void smoke4() {
	Reporter.log("SmokeTest4", true);
	}

}

