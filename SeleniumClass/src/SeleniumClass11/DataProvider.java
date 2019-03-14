package SeleniumClass11;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider {

	Workbook wb;
	
	public DataProvider(String path) throws Exception{
		if(path.endsWith("xlsx")) {
			wb = new XSSFWorkbook(new File(path));
		} else if(path.endsWith("xls")) {
			wb = new HSSFWorkbook(new FileInputStream(path));
		} else {
			System.out.println("Invalid Excel File "+path);
			System.exit(0);
		}
		
	}
	
	public Map<String, String> getRegisterMap() {
		Map<String, String> map = new HashMap<>();
		
		Sheet sheet = wb.getSheet("Register");
		
		Row row = sheet.getRow(1);
		if(row!=null) {
			map.put("edition", row.getCell(0).getStringCellValue());
			map.put("firstname", row.getCell(1).getStringCellValue());
			map.put("lastname", row.getCell(2).getStringCellValue());
			map.put("email", row.getCell(3).getStringCellValue());
			map.put("confirmemail", row.getCell(4).getStringCellValue());
			map.put("username", row.getCell(5).getStringCellValue());
			map.put("password", row.getCell(6).getStringCellValue());
			map.put("confirmpassword", row.getCell(7).getStringCellValue());
			map.put("companyname", row.getCell(8).getStringCellValue());
			map.put("phone", row.getCell(9).getStringCellValue());
			
		} else {
			System.out.println("No Data on Row 1");
			System.exit(0);
		}
		
		return map;
	}
	
	public Map<String, String> getLoginMap() {
		Map<String, String> map = new HashMap<>();
		
		Sheet sheet = wb.getSheet("Login");
		
		Row row = sheet.getRow(1);
		if(row!=null) {
			map.put("username", row.getCell(0).getStringCellValue());
			map.put("password", row.getCell(1).getStringCellValue());
			
		} else {
			System.out.println("No Data on Row 1");
			System.exit(0);
		}
		
		return map;
	}
}
