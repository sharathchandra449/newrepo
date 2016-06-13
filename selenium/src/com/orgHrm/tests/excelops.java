package com.orgHrm.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelops 
{
	@Test
	public void excel() throws IOException
	{
		String xlpath="F:\\bash\\selenium\\src\\com\\orgHrm\\testdata\\testdata.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		XSSFRow R=ws.getRow(3);
		
		XSSFCell C=R.getCell(0);
		System.out.println(C.getStringCellValue());
		
		XSSFCell C1=R.getCell(1);
		System.out.println(C1.getStringCellValue());
		
		
	}

}
