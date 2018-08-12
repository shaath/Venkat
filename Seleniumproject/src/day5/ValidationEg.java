package day5;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationEg {

	public static void main(String[] args) throws IOException 
	{
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat foramte=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String ts=foramte.format(d);
		System.out.println(ts);
		String Final=((ts.replace("/", "")).replace(" ", "")).replace(":", "");
		System.out.println(Final);
		String expval="Google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gookkkkkk.com");
		
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\screenshots\\Error"+Final+".png"));
			
		}

	}

}
