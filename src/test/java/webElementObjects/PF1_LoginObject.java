package webElementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF1_LoginObject
{
	WebDriver driver;
	
	public PF1_LoginObject(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy(xpath="//div//input[@id='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//div//input[@id='login-button']")
	private WebElement loginButton;
	
	
	public void verifyTitle() 
	{
		System.out.println("title is: "+driver.getTitle());
	}
	
	public void verifyLogin(String username, String password) 
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		loginButton.click();
		
		System.out.println("Login is successful...");
	}
	
	public void verifyCurrentUrl() 
	{
		System.out.println("current url is: "+driver.getCurrentUrl());
		System.out.println("current url is captured ");
	}
	

}
