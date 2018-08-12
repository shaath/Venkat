package day5;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://google.com");
//		
//		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\screenshots\\google.png"));
		
		driver.get("http://www.google.com");
		WebElement ele = driver.findElement(By.linkText("Gmail"));

		// Get entire page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page
		Point point = ele.getLocation();

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		File screenshotLocation = new File("F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\screenshots\\gmail.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
	}

}
