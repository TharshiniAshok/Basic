package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ELead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															


	}

}
