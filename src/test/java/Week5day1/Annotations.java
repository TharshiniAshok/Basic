package Week5day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import week2day1.SeMethods;

public class Annotations extends SeMethods {
	
	@paremeter({"url"})
  @BeforeMethod
  public void login() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	  
  }
  
	@BeforeMethod
  public void CreateLead()
  {
	  CreateLead();
  }
  @AfterMethod
  public void close() {
	  closeBrowser();
  }
}
