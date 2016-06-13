package com.orgHrm.TestSuite;

import java.io.IOException;

import com.orgHrm.master.orgMaster;

public class orgHrmSuite 
{

	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		//Login test case
		String res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		om.screenshot("launch.png");

		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		om.screenshot("login.png");
		
		
		res=om.org_Logout();
		System.out.println(res);
		om.screenshot("logout.png");
		
		om.org_Close();
		
		//empreg test
		
		res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);

		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Venki", "Ch");
		System.out.println(res);
		om.screenshot("empreg.png");
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		
		//userreg test
		
		res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);

		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Venki Ch", "Venki123456", "Venki123456", "Venki123456");
		System.out.println(res);
		om.screenshot("usereg.png");
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//user login
		
		res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);

		res=om.org_Login("Venki123456", "Venki123456");
		System.out.println(res);
		om.screenshot("userlogin.png");
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
