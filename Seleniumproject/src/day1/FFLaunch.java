package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunch {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
//		FirefoxDriver d=new FirefoxDriver();
//		d.get("http://gmail.com");
	}

}
