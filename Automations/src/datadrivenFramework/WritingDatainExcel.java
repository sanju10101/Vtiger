package datadrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDatainExcel {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
          FileInputStream fis= new FileInputStream(".\\data\\inputData.xlsx");
          Workbook wb = WorkbookFactory.create(fis);
        Sheet sh=  wb.getSheet("Sheet1");
       Row r= sh.getRow(3);
       Cell c = r.createCell(2);
       c.setCellValue("sand");
       FileOutputStream fos = new FileOutputStream(".\\data\\inputData.xlsx");
               
	}

}
