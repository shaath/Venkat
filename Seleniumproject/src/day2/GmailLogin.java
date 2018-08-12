package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		//opening firefox
//		FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//opening the gmail in firefox
		driver.get("http://gmail.com");
		//maximizing the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		//Entering email id into email textbox
		email.sendKeys("testingtoolstrainer449@gmail.com");
//		Thread.sleep(5000);
		//clearing the text in email textbox
//		email.clear();
		//clicking on next
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
//		Thread.sleep(5000);
		//entering text into password
		driver.findElement(By.name("password")).sendKeys("123456789");
		//clicking on next
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
	}

}
