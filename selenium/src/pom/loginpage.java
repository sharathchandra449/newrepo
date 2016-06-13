package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage
{
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void login(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	

}
