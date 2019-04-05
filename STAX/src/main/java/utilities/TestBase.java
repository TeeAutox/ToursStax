package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	static String applicationURL = "http://usstaging.staexperiences.com/search?supplier=2677";
	static String applicationURL1 = "http://usstaging.staexperiences.com/search?supplier=666";
	static String applicationURL2 = "http://usstaging.staexperiences.com/search?supplier=1743";
	static String applicationURL3 = "http://usstaging.staexperiences.com/search?supplier=863";
	static String applicationURL4 = "http://usstaging.staexperiences.com/search?supplier=1020";
	static String applicationURL5 = "http://usstaging.staexperiences.com/search?supplier=2667";
	static String applicationURL6 = "http://usstaging.staexperiences.com/search?supplier=103";
	public static WebDriver STAXDriver = null;

    // This method is used to initialise the Chrome Browser
    public static void main() {
               File file = new File("C:\\Automation\\drivers\\chromedriver_win32");
               System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
               STAXDriver = new ChromeDriver();
               STAXDriver.manage().window().maximize();
              STAXDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // This method is used to Launch the application
    public void openContikiUrl() {
              STAXDriver.navigate().to(applicationURL5);
    }

    // This method is used to close the driver
    public void quitDriver() {
               STAXDriver.quit();
    }

}
