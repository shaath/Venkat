package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrgHrmLib 
{
	public static String url="http://opensource.demo.orangehrmlive.com/";
	public static WebDriver driver=null;
	public static String expval,actval;
	
	public static FileInputStream fi;
	public static Properties pr;
	//Launch
	public String OrgLaunch(String url) throws IOException
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
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Login
	public String OrgLogin(String u,String p)
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	//Logout
	public String OrgLogout()
	{
		expval="Login";
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	//Close
	public void OrgClose()
	{
		driver.close();
	}
	
	//Employee Registration
	public String OrgEmp(String f,String l,String EmpId)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(EmpId);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//User Registration
	
	public String OrgUserReg(String ename, String uname,String pswd,String cpswd)
	{
		boolean flag=false;
		expval=uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pswd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpswd);
		driver.findElement(By.id("btnSave")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				flag=true;
				break;
			}
			
		}
		
		if (flag == true)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
}
