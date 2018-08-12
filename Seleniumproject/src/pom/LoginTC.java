package pom;

import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class LoginTC extends Constants {

	public static void main(String[] args)
	{
		
		driver.get(url);	
		driver.manage().window().maximize();
		
		lp.login(u, p);
		
		Sleeper.sleepTightInSeconds(5);
			
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();

	}

}
