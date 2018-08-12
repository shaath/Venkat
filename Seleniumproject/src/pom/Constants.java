package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Admin";
	
	public static WebDriver driver=new FirefoxDriver();
	public static LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	public static AdminPage ap=PageFactory.initElements(driver, AdminPage.class);

}
