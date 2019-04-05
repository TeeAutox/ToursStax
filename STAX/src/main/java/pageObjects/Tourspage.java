package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Tourspage {
static WebDriver driver;
	
	
	
By sortdropdown= By.id("sortSelect");
By tour= By.xpath("//*[@id=\'products\']/div[1]/div/div[2]/div[1]/h4/a");
By totalsearchresult= By.id("lblTotalSearchResult");

public Tourspage(WebDriver driver) 
{
	Tourspage.driver=driver;
}
public void VerifyToursLoad()
{
	System.out.println(driver.findElement(totalsearchresult).getText());


}
public void Applysearch() 
{

	driver.findElement(sortdropdown).click();
	Select sort = new Select(driver.findElement(By.id("sortSelect")));
	sort.selectByVisibleText("Price (Low-High)");
	assertEquals("Price (Low-High)", sort.getFirstSelectedOption().getText());
}
public void MakeaBooking() 
{
	driver.findElement(tour).click();
	
}
}