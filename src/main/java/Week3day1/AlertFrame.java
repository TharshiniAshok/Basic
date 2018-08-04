package Week3day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launching Google Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Creating Object
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert=driver.switchTo().alert();
		String prompttext="Gayathri";
		alert.sendKeys(prompttext);
		alert.sendKeys("Gayathri");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		System.out.println(text);
		if(text.contains(prompttext))
		{
			System.out.println("There is");
		}
		else
		{
			System.out.println("There is no");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
