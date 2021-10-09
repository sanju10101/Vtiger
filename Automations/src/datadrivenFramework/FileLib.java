package datadrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readExcelData(String path,String SheetName,int row,int cell) throws Throwable{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
	String Excelvalue=wb.getSheet(SheetName).getRow(row).getCell(cell).toString();
	return Excelvalue;
	
	}
	public void writeExcelData(String path,String SheetName,int row,int cell,String data)throws Throwable{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
	}
	public int getRowCount(String path,String sheet) throws Throwable{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb= WorkbookFactory.create(fis);
		int rowcount = wb.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
		
	}


