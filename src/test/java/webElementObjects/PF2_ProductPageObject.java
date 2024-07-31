package webElementObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF2_ProductPageObject
{
	WebDriver driver;
	
	public PF2_ProductPageObject(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement item1;
	
	@FindBy(xpath="//a//div[@class='inventory_item_name ']")
	private List<WebElement> productList;
	
	@FindBy(xpath="//div//button[@id='add-to-cart']")
	private WebElement additem2;
	
	@FindBy(xpath="//a//span[@class='shopping_cart_badge']")
	private WebElement cartLogo;
	
	
	public void verifyAddToCart1() 
	{
		item1.click();		
	}
	
	public void verifyAddToCart2(String item2) 
	{
		List<WebElement>ite=productList;
		
		System.out.println("***<All listed products are>****");
		
		for(WebElement i:ite) 
		{
			System.out.println(i.getText());
		}
		
		for(WebElement i:ite) 
		{
			if(i.getText().contains(item2)) 
			{
				i.click();
				additem2.click();
				break;
			}
		}
		
		System.out.println("item2 added to cart: "+item2);
	}
	
	public void verifyCartLogo() 
	{
		cartLogo.click();
	}

}
