package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF3_CheckoutPageTestCase extends PageFactoryBaseClass
{
	@BeforeTest
	public void preRequisites() 
	{
		browserSetup();						
		
		pflpo.verifyTitle();
		pflpo.verifyLogin("standard_user","secret_sauce");
		pflpo.verifyCurrentUrl();
		
		pfppo.verifyAddToCart1();
		pfppo.verifyAddToCart2("Sauce Labs Fleece Jacket");
		pfppo.verifyCartLogo();		
		
	}
	
	
	@Test
	public void checkOut()
	{
		pfcpo.verifyCheckoutButton();
	
		pfcpo.verifyDetails("Pradip","Shimpi", "411041");
	
		pfcpo.verifyContinueButton();
	}
}
