package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.Tourspage;

public class Tours_HomePg_StepDef {
	
@Test
 public void launchToursPage() throws Throwable
 {
	//launch chrome and get cbe site
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://usstaging.staexperiences.com/search?supplier=2677"); 
	 
	 
	 
	 //verify tours result are returned
	 Tourspage tours = new Tourspage(driver);
	 tours.VerifyToursLoad();
		
		
	 
}
 
}
