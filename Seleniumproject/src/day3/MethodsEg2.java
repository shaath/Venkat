package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().to("http://seleniumhq.org");
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().refresh();
	}

}
