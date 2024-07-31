package webElementTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webElementObjects.PF1_LoginObject;
import webElementObjects.PF2_ProductPageObject;
import webElementObjects.PF3_CheckoutPageObject;
import webElementObjects.PF4_PlaceOrderObject;
import webElementObjects.PF5_HomePageObject;

public class PageFactoryBaseClass
{
	
	WebDriver driver;
	
	PF1_LoginObject pflpo;
	PF2_ProductPageObject pfppo;
	PF3_CheckoutPageObject pfcpo;
	PF4_PlaceOrderObject pfpoo;
	PF5_HomePageObject pfhpo;
	
	
	public void browserSetup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("browser is opened..");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is launched..");
		
		pflpo = new PF1_LoginObject(driver);
		
		pfppo=new PF2_ProductPageObject(driver);
		
		pfcpo=new PF3_CheckoutPageObject(driver);
		
		pfpoo=new PF4_PlaceOrderObject(driver);
		
		pfhpo=new PF5_HomePageObject(driver);
		
	}

}
