package backup;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://google.com");
		
		//navigate
		d.navigate().to("http://facebook.com");
		
		d.navigate().back();
		
		//manage()
		
		d.manage().window().maximize();
	

	}

}
