import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\ankus\\eclipse-workspace\\ExcelRead.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		int lastRowCount = sheet1.getLastRowNum();
		
		//System.out.println("Data: "+data0);
		//System.out.println("Data: "+data1);
		//System.out.println(lastRowCount+1);
		
		for(int i =0; i<= lastRowCount;i++)
		{
			System.out.print(sheet1.getRow(i).getCell(0).getStringCellValue());
			System.out.print(" ");
			System.out.print(sheet1.getRow(i).getCell(1).getStringCellValue());
			System.out.print(" ");
			System.out.println(sheet1.getRow(i).getLastCellNum());
			System.out.println();
		}
		
	}

}
