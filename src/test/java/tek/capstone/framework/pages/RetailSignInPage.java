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
	public WebElement emailvalue;
	
	@FindBy(id = "password")
	public WebElement passwordvalue;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBtn;
	
	@FindBy(id = "newAccountBtn")
	public WebElement newaccountbtn;
	
	@FindBy(id = "nameInput")
	public WebElement namefeild;
	
	@FindBy(id = "emailInput")
	public WebElement emailfeild;
	
	@FindBy (id = "passwordInput")
	public WebElement passworfeild;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmepassvalue;
	
	@FindBy(id = "signupBtn")
	public WebElement signupBtn;
	
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "accountLink")
	public WebElement accountlink;
	

	}

