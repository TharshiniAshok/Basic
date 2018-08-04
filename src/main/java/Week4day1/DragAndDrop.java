package Week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Droppable']").click();
	    WebElement eleframe = driver.findElementByClassName("demo-frame");
	    driver.switchTo().frame(eleframe);
	    WebElement eledrag = driver.findElementByXPath("//div[@id='draggable']");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(eledrag, 150, 100).perform();
	}

}
