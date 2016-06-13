package Autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class filedownload {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.53.0")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		Runtime.getRuntime().exec("E:\\filedownload.exe");
	}

}
