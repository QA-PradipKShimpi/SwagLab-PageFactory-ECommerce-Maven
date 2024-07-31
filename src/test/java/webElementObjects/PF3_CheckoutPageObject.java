package webElementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF3_CheckoutPageObject
{
	WebDriver driver;
	
	public PF3_CheckoutPageObject(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div//button[text()='Checkout']")
	private WebElement checkoutButton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement pinCode;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueButton;
	
	
	public void verifyCheckoutButton() 
	{
		checkoutButton.click();
	}
	
	public void verifyDetails(String firstname, String lastname, String pincode) 
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		pinCode.sendKeys(pincode);
	}
	
	public void verifyContinueButton() 
	{
		continueButton.click();
	}
	
	
}
