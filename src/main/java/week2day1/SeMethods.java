package week2day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) throws WebDriverException{
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 driver = new FirefoxDriver();		
			}
	
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		System.err.println("WebDriverException has occurred");
		//throw new RuntimeException();
		}catch(Exception e)
		{
			System.err.println("Exception is occured");
		}
		
		
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();
		
	}

	public WebElement locateElement(String locator, String locValue) throws NoSuchElementException,NullPointerException {
	try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linkText": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exception hass occurred");
		}
	
		return null;
	}

	public WebElement locateElement(String locValue) {
	
		try {
			return driver.findElementById(locValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Exceptionnn has occured");
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("sendkey values is wrong");
		}finally {
			
		takeSnap();
		}
	}
	public void keyEnter(WebElement ele, String data) {
		ele.sendKeys(data,Keys.ENTER);
		System.out.println("The Data "+data+" is Entered Successfully");
		takeSnap();
	}
	
	public void clear(WebElement ele)
	{
		ele.clear();
		takeSnap();
		
	}

	public void click(WebElement ele) {
	ele.click();
	System.out.println("The Element "+ele+" is clicked Successfully");
	takeSnap();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String eleText=ele.getText();
		System.out.println(eleText);
		return eleText;
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The dropdown "+value+ " is selected successfully");
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByIndex(index);
		System.out.println("The dropdown "+index+ " is selected successfully");
		takeSnap();
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByValue(value);
		System.out.println("The dropdown "+value+ " is selected successfully");
		takeSnap();
	}
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean breturn = false;
		if(driver.getTitle().equals(expectedTitle))
		{
			System.out.println("The Title "+expectedTitle+ " is verified");
			breturn= true;
		}
		else
		{
			System.out.println("The Title "+expectedTitle+ " is not verified");
		}
		
		return breturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if(text.equals(expectedText))
		{
			System.out.println("The Firstname " +expectedText+ " is verified");
		}else
		System.out.println("The Firstname "+ expectedText+ "is not verified");
		
		
		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String eletext = ele.getText();
		if(eletext.contains(expectedText))
		{
			System.out.println("The Text "+expectedText+ " is verified");
		}
		else
		{
			System.out.println("The Text "+expectedText+ " is not verified");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String eleatt=ele.getAttribute(attribute);
		if(eleatt.equals(value))
		{
			System.out.println("The attribute "+value+ " is verified");
		}else
			System.out.println("The attribute "+value+ " is NOT verified");
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String eleatt=ele.getAttribute(attribute);
		if(eleatt.contains(value))
		{
			System.out.println("The attribute "+value+ " is verified");
		}else
			System.out.println("The attribute "+value+ " is NOT verified");
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		boolean check=ele.isSelected();
		System.out.println(check);
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean check=ele.isDisplayed();
		System.out.println(check);
	}

	public void switchToWindow(int index) {
	
		
		Set<String> allWindow=driver.getWindowHandles();
		List<String> listWindow= new ArrayList<String>();
		listWindow.addAll(allWindow);
		driver.switchTo().window(listWindow.get(index));
		System.out.println("The window is Switched");
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
	
		driver.switchTo().frame(ele);
		
		
	}
	public void switchToFrameComeOut() {
		// TODO Auto-generated method stub
	
		driver.switchTo().parentFrame();
		
	}
	public void switchToFrameDefault() {
		// TODO Auto-generated method stub
	
		driver.switchTo().defaultContent();
		
	}
	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		//System.out.println("start");
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alert=driver.switchTo().alert();
		String alert1= alert.getText();
		System.out.println(alert1);
		
		return alert1;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
