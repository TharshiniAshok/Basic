package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends Annotations {
	@Test
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
		
		/*//To click crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		//To click create lead link
		driver.findElementByLinkText("Find Leads").click();
		//To Enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		//To Enter first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri");
		//To Enter last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Gayu");
		//To click create lead
		driver.findElementByClassName("smallSubmit").click();

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']").click();*/
		
		
		
		/*WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		//source.sendKeys("Employee");
		
		Select ss=new Select(source);	
		ss.selectByVisibleText("Public Relations");
		
		List<WebElement> options = ss.getOptions();
		int n = options.size();
		ss.selectByIndex(n-3);
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}*/
	
	}

}
