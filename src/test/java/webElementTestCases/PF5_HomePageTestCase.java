package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF5_HomePageTestCase extends PageFactoryBaseClass
{
	@BeforeTest
	public void preRequisites()
	{
		browserSetup();
		
		pflpo.verifyTitle();
		pflpo.verifyLogin("standard_user","secret_sauce");
		pflpo.verifyCurrentUrl();
	}
	
	@Test
	public void homePage() throws Exception
	{
		pfhpo.verifySortContainerLogo();
	
		pfhpo.verifySortContainerList();	
		
		pfhpo.verifyDescendingList();
		
		pfhpo.verifyAscendingList();
		
		pfhpo.verifyHighToLowList();
		
		pfhpo.verifyLowToHighList();
		
		pfhpo.verifyMenuBar();
		
		pfhpo.verifyMenuOption();
		
		pfhpo.verifySocialLinks();
		
		pfhpo.verifyLogOut();
		
	}
}
