package DataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	@Test
	public void ExcleWrite() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/Data/WriteTest.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("admin");
		row1.createCell(1).setCellValue("Admin123");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("rakesh");
		row2.createCell(1).setCellValue("rakesh123");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Writing completed");
		
	}

}
