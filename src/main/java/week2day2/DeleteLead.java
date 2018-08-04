package week2day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Launch the browser
		driver.get("http://leaftaps.com/opentaps");

		//maximize the browser
		driver.manage().window().maximize();

		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");

		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();

		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//Click Leads link
		driver.findElementByLinkText("Leads").click();

		//Click Find leads		
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//Click on Phone
		driver.findElementByLinkText("Phone").click();

		//Enter phone number
		driver.findElementByName("phoneNumber").sendKeys("9597704568");

		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(5000);

		//Capture lead ID of First Resulting lead
		WebElement leadid =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String getleadid = leadid.getText();
		System.out.println("Captured Lead ID : "+getleadid);

		//Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		//Click Delete
		driver.findElementByXPath("//a[text()='Delete']").click();


		//Click Find leads		
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		//Enter captured lead ID
		driver.findElementByName("id").sendKeys(getleadid);


		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//Verify error msg
		String errm = driver.findElementByXPath("//div[@class = 'x-paging-info']").getText();
		System.out.println(errm);

		if (errm.contains("No records to display")) {

			System.out.println("Delete Successful!!");
		}
		else {
			System.out.println("Delete Unsuccessful");
		}

		//Close the browser (Do not log out)
		driver.close();

	}

}


	


