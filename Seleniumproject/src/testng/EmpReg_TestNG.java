package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{
	
	@Test(dataProvider="data")
	public void Org_Empreg(String f,String l,String EmpId)
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
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][3];
		
		x[0][0]="ManiKanta";
		x[0][1]="G";
		x[0][2]="MG1234";
		
		x[1][0]="Meghana";
		x[1][1]="P";
		x[1][2]="MP1234";
		
		x[2][0]="Prasanna";
		x[2][1]="P";
		x[2][2]="PP1234";
		
		return x;
	}
}
