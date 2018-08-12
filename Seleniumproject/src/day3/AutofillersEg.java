package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("S");
		Thread.sleep(5000);

		List<WebElement> cities=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		
		for (int i = 0; i < cities.size(); i++)
		{
			String name=cities.get(i).getText();
			System.out.println(name);
			if (name.equalsIgnoreCase("Shimla"))
			{
				cities.get(i).click();
				break;
			}
		}
	}

}
