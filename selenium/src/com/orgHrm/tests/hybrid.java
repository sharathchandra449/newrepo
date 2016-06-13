package com.orgHrm.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHrm.master.orgMaster;

public class hybrid 
{
	@Test
	public void hybriddrive() throws IOException
	{
		String res = null;
		orgMaster om=new orgMaster();
		String xlpath="F:\\bash\\selenium\\src\\com\\orgHrm\\testdata\\Hybrid.xlsx";
		String xlpath1="F:\\bash\\selenium\\src\\com\\orgHrm\\results\\Hybridout.xlsx";
		
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		
		XSSFSheet ws1=wb.getSheet("Teststeps");
		
		XSSFSheet ws2=wb.getSheet("empregdata");
		
		int tccnt=ws.getLastRowNum();
		int tscnt=ws1.getLastRowNum();
		int empcnt=ws2.getLastRowNum();
		
		
		for (int i = 1; i <= tccnt; i++)
		{
			String execute=ws.getRow(i).getCell(2).getStringCellValue();
			if (execute.equalsIgnoreCase("Y"))
			{
				String tcid=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tscnt; j++)
				{
					String tstcid=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcid.equalsIgnoreCase(tstcid))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							res=om.Org_Launch("Http://opensource.demo.orangehrm.com");
							break;
							
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
							
						case "logout":
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= empcnt; k++)
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							
							}
							
							break;
							
						case "Usereg":	
							res=om.org_Userreg("Qedge Tech", "Qedge123456", "Qedge123456", "Qedge123456");
							break;
						case "Ulogin":
							res=om.org_Login("Qedge123456", "Qedge123456");
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//updating result in test steps sheet
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						//updating the result in test case sheet
						
						if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).createCell(3).setCellValue(res);
							
						}
						else
						{
							ws.getRow(i).createCell(3).setCellValue("Fail");
						}
					}
					
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("Blocked");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlpath1);
		wb.write(fo);
		wb.close();
		
	}

}
