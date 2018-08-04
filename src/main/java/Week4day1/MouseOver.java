package Week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI3tKUtcue3AIVWBK9Ch2cIwOpEAAYASAAEgJ8MfD_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!260637261012!e!!g!!flipkart&ef_id=WeM6pgAAAGopLgOy:20180714122724:s");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eletvapp = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement elethomson = driver.findElementByXPath("//span[text()='Thomson']");
		Actions builder=new Actions(driver);
		builder.moveToElement(eletvapp).pause(3000).click(elethomson).build().perform();
		
	}

}
