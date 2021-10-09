package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	public void readPropertyData(String proppath,String key)throws Throwable {
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty(key, "Incorrect Key");
		
	}

}
