package webElementObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PF5_HomePageObject
{
	WebDriver driver;
	
	public PF5_HomePageObject(WebDriver driver)
	{
		this.driver=driver;	
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//select[@data-test='product-sort-container']") // to iterate cartLogo list
	private WebElement sortContainerLogo;
	
	@FindBy(xpath="//a//div[@class='inventory_item_name ']") // to iterate product list
	private List<WebElement> productList;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuBar;
	
	@FindBy(xpath="//div//nav[@class='bm-item-list']//a")
	private List<WebElement> menuOptions;
	
	@FindBy(xpath="//ul[@class='social']//li//a")
	private List<WebElement> social;
	
	public void verifySortContainerLogo() 
	{
		sortContainerLogo.click();
	}
	
	public void verifySortContainerList() 
	{				
		WebElement ite = sortContainerLogo;		
		Select sel=new Select(ite);
		
		System.out.println("***<Sort options are>***");
		
		List<WebElement> asc=sel.getOptions();
		
		for(WebElement i:asc) 
		{
			System.out.println(i.getText());
		}

	}
	
	public void verifyDescendingList() 
	{
		WebElement ele=sortContainerLogo;	
		Select sel=new Select(ele);

		sel.selectByVisibleText("Name (Z to A)");
		System.out.println("*** items sort Name (Z to A) order **** ");
		
		List<WebElement> ite2=productList;
		
		for(WebElement i:ite2) 
		{
			System.out.println(i.getText());
		}		
	}
	
	public void verifyAscendingList() 
	{
		WebElement ele=sortContainerLogo;	
		Select sel=new Select(ele);

		sel.selectByVisibleText("Name (A to Z)");
		System.out.println("*** items sort Name (A to Z) order **** ");
		
		List<WebElement> ite2=productList;
		
		for(WebElement i:ite2) 
		{
			System.out.println(i.getText());
		}		
	}
	
	public void verifyHighToLowList() 
	{
		WebElement ele=sortContainerLogo;	
		Select sel=new Select(ele);

		sel.selectByVisibleText("Price (low to high)");
		System.out.println("*** items sort Price (low to high) order **** ");
		
		List<WebElement> ite2=productList;
		
		for(WebElement i:ite2) 
		{
			System.out.println(i.getText());
		}		
	}
	
	public void verifyLowToHighList() 
	{
		WebElement ele=sortContainerLogo;	
		Select sel=new Select(ele);

		sel.selectByVisibleText("Price (high to low)");
		System.out.println("*** items sort Price (high to low) order **** ");
		
		List<WebElement> ite2=productList;
		
		for(WebElement i:ite2) 
		{
			System.out.println(i.getText());
		}		
	}
		
	public void verifyMenuBar() throws Exception 
	{
		Thread.sleep(3000);
		menuBar.click();
		System.out.println("clicked on menu bar");
	}
		
	public void verifyMenuOption() throws Exception 
	{
		List<WebElement> ite3=menuOptions;
		
		System.out.println("*** All menu options are ****");
		
		Thread.sleep(3000);
		
		for(WebElement i:ite3) 
		{
			System.out.println(i.getText());
		}
		
	}
	
	public void verifySocialLinks() 
	{
		List<WebElement>soc=social;
		
		System.out.println("*** Social media links are: "+soc.size());
		
		for(WebElement i: soc) 
		{
			System.out.println(i.getText()+" : "+i.getAttribute("href"));
		}
		
	}

	public void verifyLogOut() 
	{
		List<WebElement> ite4=menuOptions;
		
		for(WebElement i:ite4) 
		{
			if(i.getText().contains("Logout")) 
			{
				i.click();
				break;
			}
		}
		System.out.println("LogOut is successful");
	}
	
}
