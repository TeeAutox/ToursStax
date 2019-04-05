package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverforall {
	
		
		protected static WebDriver driver;
		
		protected WebDriver callDriver() {
			if(driver == null) {
				
				driver = new ChromeDriver();
			}
			return driver;
		}

	}

