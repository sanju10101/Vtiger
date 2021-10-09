package datadrivenFramework;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadDataFromExcels {
public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\\data\\inputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(5);
		Cell c = r.getCell(0);
		String value=c.getStringCellValue();
		System.out.println(value);
		

	}
  
}
