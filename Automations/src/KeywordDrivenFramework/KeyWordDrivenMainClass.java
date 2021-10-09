package KeywordDrivenFramework;

public class KeyWordDrivenMainClass {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
        FileLib flib = new FileLib();
        flib.readPropertyData("./data/config.properties", "browser");
    //  System.out.println(value);        
	}

}
