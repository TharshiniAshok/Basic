package week2day1;

import org.testng.annotations.Test;

public class CreLead extends Annotations {
	
	@Test

	public static void main(String[] args) {
		
		startApp("chrome","http://leaftaps.com/opentaps");
		type(locateElement("id","username"),"DemoSales");
		type(locateElement("id","password"),"crmsfr");
		
		

	}

}
