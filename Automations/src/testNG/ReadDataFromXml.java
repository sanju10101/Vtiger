package testNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXml {
	@Parameters("browsers")
	@Test
	public void readData(String br) {
		Reporter.log(br, true);
	}
}
