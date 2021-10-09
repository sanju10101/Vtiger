package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationsMainClass extends AnnotationsInTestNG {
@Test
public void run() {
	Reporter.log("run test method", true);
}
@Test
public void bun() {
	Reporter.log("bun test method", true);
}
}
