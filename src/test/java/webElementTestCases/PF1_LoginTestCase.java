package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF1_LoginTestCase extends PageFactoryBaseClass
{
	@BeforeTest
	public void openbrowserSetup() 
	{
		browserSetup();
	}
	
	
	@Test
	public void verifyLogin()
	{
		pflpo.verifyTitle();
		
		pflpo.verifyLogin("standard_user","secret_sauce");
		
		pflpo.verifyCurrentUrl();
	
	}
	

}
