package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderEg {

	public static void main(String[] args) 
	{
		boolean falg=false;
		String date="18/Nov/2019";
		String[] x=date.split("/");
		String day=x[0];
		String month=x[1];
		String year=x[2];
		System.out.println(day+"----"+month+"----"+year);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		
		//Month and Year Selection
		
		String calyear=driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
		
		while(!calyear.trim().equalsIgnoreCase(month+" "+year))
		{
//			System.out.println(calyear);
			driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			calyear=driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText();
		}
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		for (int i = 2; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				String calday=cols.get(j).getText();
				if (calday.equals(day))
				{
					falg=true;
					cols.get(j).click();
					break;
				}
			}
			if (falg==true)
			{
				break;
			}			
			
			
		}
		

	}

}
