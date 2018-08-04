package week2day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("(//div[@id='label'])[1]").click();
		
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TestLeaf");
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Lakshmi");
		
		WebElement source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select obj1=new Select(source);
		obj1.selectByIndex(3);
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("hunbub");
		
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("ytvhj");
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Demo");
		
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("3478");
		
		WebElement Industry = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select obj2=new Select(Industry);
		obj2.selectByVisibleText("Computer Hardware");
		
		WebElement Ownership = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select obj3=new Select(Ownership);
		obj3.selectByVisibleText("Partnership");
		
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("T7890");
		
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("gjgkg");
		
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("sdtfygujhcx");
		
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Gayu");
		
		WebElement MarketingCampaign = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select obj4=new Select(MarketingCampaign);
		obj4.selectByVisibleText("Affiliate Sites");
		
		
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("G");
		
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("BCA");
		
		WebElement 	PreferredCurrency = driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select obj5=new Select(PreferredCurrency);
		obj5.selectByIndex(2);
		
		
		
		
		
		
		
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("36");
		driver.findElementByXPath("//input[@id='createLeadForm_tickerSymbol']").sendKeys("f");
		
		//contact information
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("5");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("5678");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("45878");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("gayu@gmail.com");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("567876543");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAskForName']").sendKeys("cgeck");

		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("http//www.gmail.com");
		
		//Primary Address

		driver.findElementByXPath("//input[@id='createLeadForm_generalToName']").sendKeys("theg");

		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress1']").sendKeys("yellagiri");

		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("vellore");

	
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("5698");
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalAttnName']").sendKeys("stage");
		driver.findElementByXPath("//input[@id='createLeadForm_generalAddress2']").sendKeys("chennai");
		
		WebElement 	StateProvince	 = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select obj6=new Select(StateProvince);
		obj6.selectByIndex(2);
		
		WebElement 	Country	 = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select obj7=new Select(Country);
		obj7.selectByIndex(2);
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		

	}

}
