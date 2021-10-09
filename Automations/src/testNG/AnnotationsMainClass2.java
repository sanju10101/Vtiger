package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationsMainClass2 extends AnnotationsInTestNG{
@Test
public void gun() {
	Reporter.log("gun test method", true);
}

}
