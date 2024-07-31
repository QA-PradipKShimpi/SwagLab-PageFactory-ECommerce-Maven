package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF2_ProductPageTestCase extends PageFactoryBaseClass
{
	@BeforeTest
	public void preRequisites()
	{
		browserSetup();					// baseClass preRequisites
		
		pflpo.verifyTitle();
		pflpo.verifyLogin("standard_user","secret_sauce");
		pflpo.verifyCurrentUrl();		// login preRequisites
				
	}


	@Test
	public void verifyAddToCart()
	{
		pfppo.verifyAddToCart1();
		
		pfppo.verifyAddToCart2("Sauce Labs Fleece Jacket");
		
		pfppo.verifyCartLogo();
		
	}

  
}
