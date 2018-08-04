package Week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			driver.findElementByLinkText("Contact Us").click();

			Set<String> allWindows = driver.getWindowHandles();
			List<String> listOfObjects=new ArrayList<String>();
			listOfObjects.addAll(allWindows);
			driver.switchTo().window(listOfObjects.get(1));

			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			
			//driver.findElementByLinkText("Contact Us").click();

			//driver.switchTo().window(listOfObjects.get(0)).close();
		} catch (WebDriverException e) {
			
			System.err.println("WebDriverException Has Been Occured");
			//throw new WebDriverException();
		}
	
	}

}
