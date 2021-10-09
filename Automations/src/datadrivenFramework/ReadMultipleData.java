package datadrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileLib flib = new FileLib();
		int rc = flib.getRowCount(".\\data\\inputData.xlsx","Sheet1");
		for(int i=0;i<=rc;i++) {
			FileInputStream fis= new FileInputStream(".\\data\\inputData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row r = sh.getRow(i);
			Cell c = r.getCell(0);
			String value=c.getStringCellValue();
			System.out.println(value);
		}

	}

}
