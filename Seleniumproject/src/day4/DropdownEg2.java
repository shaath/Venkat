package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php?osCsid=a0618f8ecc9e252c428440c7b3e782b1");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select s=new Select(country);
		
		List<WebElement> sList=s.getOptions();
		System.out.println(sList.size());
		for (int i = 0; i < sList.size(); i++) 
		{
			s.selectByIndex(i);
			String name=sList.get(i).getText();
			System.out.println(name);
		}
		
	}

}
