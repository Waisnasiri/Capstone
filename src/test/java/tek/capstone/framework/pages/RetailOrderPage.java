package tek.capstone.framework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
	
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderlink;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelorderbtn;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancelreason;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelationmsg;
	
	@FindBy(id = "reasonInput")
	public WebElement reasonInpuntBtn;
	
	@FindBy(id = "returnBtn")
	public WebElement retrurnitemBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropoffInput;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement retrunorderbtn;
	
	@FindBy(xpath ="//p[text()='Return was successfull']")
	public WebElement returnwassuccessfull;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviweBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text() ='Your review was added successfully']")
	public WebElement yourreviewadded;
	
	


}
