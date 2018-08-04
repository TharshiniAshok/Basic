package week2day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("gayathri71294");
		driver.findElementById("userRegistrationForm:password").sendKeys("Gayu@71294");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Gayu@71294");
		WebElement security = driver.findElementById("userRegistrationForm:securityQ");
		Select ss=new Select(security);

		ss.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Karthi");
		
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select sss=new Select(language);
		sss.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Gayathri");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Lakshmi");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Gayu");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		WebElement day = driver.findElementById("userRegistrationForm:dobDay");
		Select s=new Select(day);
		s.selectByIndex(6);
		
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select obj=new Select(month);
		obj.selectByVisibleText("JUN");
		
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select object=new Select(year);
		object.selectByIndex(6);
		
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select obje=new Select(occupation);
		obje.selectByIndex(4);
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234678906");
		driver.findElementById("userRegistrationForm:idno").sendKeys("SBI1890567");
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select o=new Select(country);
		o.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("gayathridl794@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("7824049353");
		
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select objec=new Select(nationality);
		objec.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:address").sendKeys("123");
		driver.findElementById("userRegistrationForm:street").sendKeys("Kaliyamman Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Mettukaniyur");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("635853",Keys.TAB);
						
		Thread.sleep(1000);
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select ooo=new Select(city);
		ooo.selectByVisibleText("Vellore");
		Thread.sleep(1000);
		WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		Select so=new Select(post);
		so.selectByIndex(2);
		//so.selectByVisibleText("Elagiri B.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("8939176962");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	}

}


