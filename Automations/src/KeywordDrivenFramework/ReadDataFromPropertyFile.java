package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      FileInputStream fis = new FileInputStream("./data./config.properties");
	   Properties prop = new Properties();
	   prop.load(fis);
	   String value = prop.getProperty("browser", "Incorrect Key");
	   System.out.println(value);
	   }

}
