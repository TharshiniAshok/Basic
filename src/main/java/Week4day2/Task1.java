package Week4day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoManager");
		driver.findElementById("password").sendKeys("crmsfasa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("PaviAshok");
		driver.findElementById("lastNameField").sendKeys("Ashok");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Gayu");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("G3");
		driver.findElementById("createContactForm_personalTitle").sendKeys("-----");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("@@@");
		driver.findElementById("createContactForm_departmentName").sendKeys("MCA");
		WebElement currency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select obj = new Select(currency);
		obj.selectByVisibleText("DZD - Algerian Dinar");
		driver.findElementById("createContactForm_description").sendKeys("Hai this is G3 and Pavi");
		driver.findElementById("createContactForm_importantNote").sendKeys("We are comming from America");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("635601");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("sohunj");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("gayathridl794@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("8807592429");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("*******");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Housing Board");
		driver.findElementById("createContactForm_generalCity").sendKeys("vellore");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("635601");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("635601");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("lusu");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Tirupattur");
		
		Thread.sleep(5000);
		
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select obj2 = new Select(country);
		obj2.selectByVisibleText("India");
		
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		//WebElement state = driver.findElementByXPath("//select[@id='createContactForm_generalStateProvinceGeoId']");
		Select obj1 = new Select(state);
		obj1.selectByVisibleText("TAMILNADU");
	
		driver.findElementByClassName("subMenuButton").click();
		
		WebElement neww = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select obj3 = new Select(neww);
		obj3.selectByVisibleText("eCommerce Site Internal Campaign");
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
	}

}
