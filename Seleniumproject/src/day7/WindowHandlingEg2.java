package day7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WindowHandlingEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		Set<String> wlist=driver.getWindowHandles();
		
		Iterator<String> it=wlist.iterator();
		while (it.hasNext())
		{
			String wId = it.next();
			System.out.println(wId);
			
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			String title=driver.getTitle();
			
			//Exception Handling
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			} 
			catch (Exception e) 
			{
				System.out.println(e);
				System.out.println("The expected link not available in this page");
			}
			
			
		}
		
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
