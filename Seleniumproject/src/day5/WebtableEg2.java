package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebtableEg2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String id=cols.get(1).getText();
			System.out.println(id);
			if (id.equals("0005"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
			
		}
		Sleeper.sleepTightInSeconds(5);
		//Validation 
		rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String id=cols.get(1).getText();
			System.out.println(id);
			if (!id.equals("0005"))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
				
			}
		}
		

	}

}
