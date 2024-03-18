package day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	public static void main(String [] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\pooja\\eclipse-workspace23\\opencart\\testData\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows:"+totalrows);
		System.out.println("Number of columns:"+totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow curentRow=sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
				//XSSFCell cell=currentRow.getCell(c);
				
				String value=curentRow.getCell(c).toString();
				System.out.print(value+"     ");
			}
				System.out.println();
				
			}
		
		    workbook.close();
		    file.close();
	}

}
