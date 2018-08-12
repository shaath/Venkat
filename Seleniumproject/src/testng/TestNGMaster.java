package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster 
{
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Admin";
	public static String f="Ant",l="Test", EmpId="TA78547";
	public static String ename=f+" "+l,uname=f+l+"1234567",pswd=f+l+"1234567",cpswd=f+l+"1234567";
	
	public static WebDriver driver=null;
	public static String expval,actval;
	
	public static FileInputStream fi;
	public static Properties pr;
	@BeforeSuite
	public void org_Launch() throws IOException
	{
		fi=new FileInputStream("F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\propertyfiles\\OrgHRM.properties");
		pr=new Properties();
		pr.load(fi);
		
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterTest
	public void Org_Logout()
	{
		expval="LOGIN";
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Logout Failed");
		
	}
	@AfterSuite
	public void Org_Close()
	{
		driver.close();
		
	}

}
