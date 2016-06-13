package com.orgHrm.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class multipleRowReading
{
	@Test
	public void excelread() throws IOException
	{
		String xlpath="F:\\bash\\selenium\\src\\com\\orgHrm\\testdata\\testdata.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int Rc=ws.getLastRowNum();
		
		System.out.println(Rc);
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow R=ws.getRow(i);
			String f=R.getCell(0).getStringCellValue();
			String l=R.getCell(1).getStringCellValue();
//			System.out.println(R.getCell(0).getStringCellValue());
//			System.out.println(R.getCell(1).getStringCellValue());
			System.out.println(f+"-----"+l);
		}
		
	}
}
