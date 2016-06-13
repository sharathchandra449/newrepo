package com.orgHrm.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orgMaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	FileInputStream fi;
	Properties pr;
	public static void main(String[] args) throws IOException
	{
		
		orgMaster om=new orgMaster();
		String res=om.Org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		
		res=om.org_Login("sravanthi123456", "sravanthi123456");
		System.out.println(res);
		
//		res=om.org_Empreg("Sharath", "Chandra");
//		System.out.println(res);
		
//		res=om.org_Userreg("sravanthi sravanthi", "sravanthi123456", "sravanthi123456", "sravanthi123456");
//		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}
	//Launch Application 
	
	public String Org_Launch(String url) throws IOException
	{
		fi=new FileInputStream("F:\\bash\\selenium\\src\\com\\orgHrm\\properties\\orghrmprop.properties");
		pr=new Properties();
		pr.load(fi);
		
		expval="btnLogin";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			screenshot("launch.png");
			return "Fail";
		}
		
		
	}
	
	//Login function
	public String org_Login(String u,String p) throws IOException
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
			
		}
		else
		{
			screenshot("login.png");
			return "Fail";
		}
	}

	//Logout Application
	
	public String org_Logout() throws IOException
	{
		expval="btnLogin";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			screenshot("logout.png");
			return "Fail";
		}
	}
	//close application
	public void org_Close()
	{
		driver.close();
	}

	public String org_Empreg(String f,String l) throws IOException
	{
		expval=f+" "+l;
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			screenshot("empreg.png");
			return "Fail";
		}
	}
	
	//user reg
	
	public String org_Userreg(String empname,String uname,String upwd,String cupwd) throws IOException
	{
		boolean flag=false;
		expval=uname;
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(upwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cupwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval)) 
			{
				flag=true;
				break;
			}
		
		}
		if (flag)
		{
			return "Pass";
			
		}
		else
		{
			screenshot("userreg.png");
			return "Fail";
		}
	}
	
	public void screenshot(String name) throws IOException
	{
		String path="F:\\bash\\selenium\\src\\com\\orgHrm\\screenshot\\"+name;
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File(path));
	}
}
