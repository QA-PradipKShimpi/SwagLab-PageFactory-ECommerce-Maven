package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF6_EndToEndTestCase extends PageFactoryBaseClass
{
	@BeforeTest
	public void preRequisites() throws Exception 
	{
		browserSetup();						// BrowserSetup preRequisites
		
		pflpo.verifyTitle();
		pflpo.verifyLogin("standard_user", "secret_sauce");
		pflpo.verifyCurrentUrl();			// Login Page preRequisites
		
		pfppo.verifyAddToCart1();
		pfppo.verifyAddToCart2("Sauce Labs Fleece Jacket");
		pfppo.verifyCartLogo();				// Product Page preRequisites
		
		pfcpo.verifyCheckoutButton();
		pfcpo.verifyDetails("Pradip", "Shimpi", "411041");
		pfcpo.verifyContinueButton();		// checkout Page preRequisites
		
		pfpoo.verifyCartSummary();
		
		pfpoo.verifyFinishButton();
		
		pfpoo.verifyBackHomeButton();		// PlaceOrder Page preRequisites
		
		pfhpo.verifySortContainerLogo();
		
		pfhpo.verifySortContainerList();	
		
		pfhpo.verifyDescendingList();
		
		pfhpo.verifyAscendingList();
		
		pfhpo.verifyHighToLowList();
		
		pfhpo.verifyLowToHighList();
		
		pfhpo.verifyMenuBar();
		
		pfhpo.verifyMenuOption();
		
		pfhpo.verifySocialLinks();
		
		pfhpo.verifyLogOut(); 					// Home Page preRequisites
		
	}
	
	@Test
	public void e2eTestCase()
	{
		System.out.println("End to End Testing is completed!");	
	}
	
	
}
