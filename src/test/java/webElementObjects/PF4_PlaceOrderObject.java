package webElementObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF4_PlaceOrderObject
{
	WebDriver driver;
	
	public PF4_PlaceOrderObject(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@id='checkout_summary_container']")
	private List<WebElement> cartSummary;
	
	@FindBy(xpath="//button[@name='finish']")
	private WebElement finishButton;
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement backHomeButton;
	
	public void verifyCartSummary() 
	{
		List <WebElement> ite=cartSummary;
		System.out.println("***<My cart summary is as below>***");
		
		for(WebElement i:ite) 
		{
			System.out.println(i.getText());
		}
	}
	
	public void verifyFinishButton() 
	{
		finishButton.click();
		System.out.println("Thank you for your order!");
	}
	
	public void verifyBackHomeButton() 
	{
		backHomeButton.click();
		
	}
	
}
