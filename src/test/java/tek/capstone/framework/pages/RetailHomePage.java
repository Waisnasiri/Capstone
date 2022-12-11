package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage () {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "signinLink")
	public WebElement signin;

	@FindBy(id = "accountLink")
	public WebElement accountlogo;
	
	@FindBy(xpath = "//*[text()='All']")
	public WebElement allsection;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsection;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersection;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smarthomesection;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsection;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automaticsection;
	
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement electvvideo;
	
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement elecvideogames;
	@FindBy(xpath = "submenuBtn")
	public WebElement submenubtn;
	
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement computeraccessories;
	
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement computernetworking;
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smarthomelighning;
	
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement smarthomeplugs;
	
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement sportathletic;
	
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement sportecercise;
	
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement automativparts;
	
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement automativmotorcycle;
	
	@FindBy(xpath = "//*[text()='Shop By department']")
	public WebElement shopbydeptext;
	
	@FindBy(id = "submenuBtn")
	public WebElement submenubtn1;
	
	@FindBy(id = "search")
	public WebElement allDepartments;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath ="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaoutdoor;
	

	@FindBy(id = "addToCartBtn")
	public WebElement addtocartBtn;
	
	@FindBy(id = "cartBtn")
	public WebElement cartBtn;
	
	@FindBy(id = "cartQuantity")
	public WebElement cartqtity;
	
	@FindBy(xpath = "//*[@class='product__select']")
	public WebElement dropdownqty;
	
	@FindBy(xpath = "//*[text()='Order Placed Successfully']")
	public WebElement orderplacesuccessfully;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedBtn;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addaddressBtn;
	
	@FindBy(xpath ="//select[@id='search']/option[2]")
	public WebElement electronicselect;
	
	
	

	
	
	
	
	
	
	
		
	
	
	
}
