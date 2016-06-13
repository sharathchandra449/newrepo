package com.orgHrm.tests;

import java.io.IOException;

import com.orgHrm.master.orgMaster;

public class userregtest {

	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);

		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Sharath Chandra", "Sharath123456", "Sharath123456", "Sharath123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}

}
