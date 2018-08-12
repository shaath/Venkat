package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String name=links.get(i).getText();
			System.out.println(name);
			if (name.equalsIgnoreCase("gmail")) 
			{
				links.get(i).click();
				break;
			}
		}
	}

}
