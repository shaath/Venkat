package day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginbutton")).click();
		
		Sleeper.sleepTightInSeconds(10);
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();

//		alt.dismiss();
	}

}
