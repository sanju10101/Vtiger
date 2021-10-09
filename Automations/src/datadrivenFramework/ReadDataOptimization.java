package datadrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataOptimization {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        FileInputStream fis = new FileInputStream(".\\data\\inputData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
      String value=  wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
      System.out.println(value);
	}

}
