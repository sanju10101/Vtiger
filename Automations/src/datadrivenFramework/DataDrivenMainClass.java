package datadrivenFramework;

public class DataDrivenMainClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileLib flib = new FileLib();
	String value=	flib.readExcelData("./data/inputData.xlsx","Sheet1",1,0);
	System.out.println(value);
    flib.writeExcelData(",/data/inputData.xlsx","Sheet1", 9, 2, "Qspiders");
    System.out.println("Done writing");
	}
	

}
