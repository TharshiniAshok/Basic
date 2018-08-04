package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// Load driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().fullscreen();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("Leads").click();
		driver.findElementByPartialLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div/input[@name='firstName'])[3]").sendKeys("Gayathri");
		driver.findElementByXPath("//div/table/tbody/tr//button[text()='Find Leads']").click();
		//driver.findElementById("ext-gen341").click();
		Thread.sleep(5000);
		/*driver.findElementByXPath("(//div/table/tbody/tr/td/div/a[@href='/crmsfa/control/viewLead?partyId=10541'])[1]").click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead"))
			{
			System.out.println("The title is displayed correctly");
			}
			else
			{
				System.out.println("The title is wrong");
			}	
	
		driver.findElementByXPath("//div/a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Bally");
		driver.findElementByXPath("(//div//tr/td/input[@name='submitButton'])[1]").click();
		String updateText = driver.findElementById("viewLead_companyName_sp").getText();
		if(updateText.contains("Bally"))
		{
			System.out.println("The String is Correct");
		}
		else
		{
			System.out.println("The string is not correct");
		}
		

		
		driver.close();*/
	}

}
