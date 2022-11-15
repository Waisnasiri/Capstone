package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		}
	@FindBy(id = "email")
	public WebElement emailfield;
	
	@FindBy(id = "password")
	public WebElement passwordfield;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBtn;
	
	@FindBy(id ="newAccountBtn")
    public WebElement newAccountButton;
	
    @FindBy(id="nameInput")
    public WebElement nameInput;
    
    @FindBy(id="emailInput")
    public WebElement emailInput;
    
    @FindBy(id="passwordInput")
    public WebElement passwordInput;
	
	
	
	}

