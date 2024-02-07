package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void excelread() throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/Data/TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		System.out.println("No of rows: "+totalrows);
		System.out.println("no of cells: "+totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				String value=cell.getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
