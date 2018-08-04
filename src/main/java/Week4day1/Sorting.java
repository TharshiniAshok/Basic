package Week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Sortable']").click();
		WebElement eleframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleframe);
		WebElement drag = driver.findElementByXPath("//ul[@id='sortable']/li");
		WebElement drag1 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		Actions builder=new Actions(driver);
		int y = drag1.getLocation().getY();
		builder.dragAndDropBy(drag, 0, y).perform();
		
	}

}
