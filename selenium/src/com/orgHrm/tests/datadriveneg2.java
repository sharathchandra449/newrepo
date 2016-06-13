package com.orgHrm.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHrm.master.orgMaster;

public class datadriveneg2 
{
	@Test
	public void usereg() throws IOException
	{
		orgMaster om=new orgMaster();
		String xlpath="F:\\bash\\selenium\\src\\com\\orgHrm\\testdata\\userreg.xlsx";
		String xlpath1="F:\\bash\\selenium\\src\\com\\orgHrm\\results\\userregresult.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int Rc=ws.getLastRowNum();
		
		System.out.println(Rc);
		
		om.Org_Launch("http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow R=ws.getRow(i);
			//reading the data from excel
			String empname=R.getCell(0).getStringCellValue();
			String username=R.getCell(1).getStringCellValue();
			String password=R.getCell(2).getStringCellValue();
			String confirmpswd=R.getCell(3).getStringCellValue();
//			System.out.println(R.getCell(0).getStringCellValue());
//			System.out.println(R.getCell(1).getStringCellValue());
			System.out.println(empname+"--"+username+"--"+password+"--"+confirmpswd);
			String res=om.org_Userreg(empname, username, password, confirmpswd);
			//writing result into excel
			R.createCell(4).setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlpath1);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}
	

}
