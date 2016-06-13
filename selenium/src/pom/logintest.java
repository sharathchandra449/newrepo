package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintest 
{
	@Test
	public void logintest123()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		lp.login("Admin", "admin");
		
		adminloginpage lap=PageFactory.initElements(driver, adminloginpage.class);;
		lap.welcomeadminclick();
		lap.logoutclick();
		
		driver.close();
		
		
	}

}
