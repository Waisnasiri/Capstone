package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id = "nameInput")
	public WebElement nameupdate;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneupdate;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updatebtn;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement updatesucessfully;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement perviouspass;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newpass;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmpass;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changepassbutn;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passupdatedsuccess;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addapaymentlink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardnumberfield;
	
	@FindBy(id ="nameOnCardInput")
	public WebElement nameoncardfield;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']/option[4]")
	public WebElement expirationmonth;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']/option[4]")
	public  WebElement expirationyear;
	
	@FindBy (id = "securityCodeInput")
	public WebElement securitycondfield;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentbtn;
	
	@FindBy(xpath ="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentmethodadded;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationmonthbtn;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationyearbtn;

	@FindBy(xpath = "//div[@class='account__payment-image-wrapper']/img")
	public WebElement cardimg;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editlink;
	
	
	@FindBy( id = "paymentSubmitBtn")
	public WebElement paymentsubmitbtn;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement payudatedSuccessfully;
	
	@FindBy(xpath = "//html[@lang='en']")
	public WebElement scrolldown;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']/option[6]")
	public WebElement editexy;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']/option[6]")
	public WebElement editexm;
	
	@FindBy(xpath = "//button[@class='text-blue-800 cursor-pointer hover:underline'][2]")
	public WebElement removelink;
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addaddresslink;
	
	@FindBy(id ="addressBtn")
	public WebElement addyouraddressBtn;
	@FindBy(id = "addAddressBtn")
	public WebElement addressBtnlink;
	
	@FindBy(xpath = "//*[text()='Update Your Address']")
	public WebElement updateyouraddressbtn;

	
	@FindBy(id = "countryDropdown")
	public WebElement addcountrydropdown;
	
	@FindBy(xpath = "//*[@id='countryDropdown']/option[6]")
	public WebElement addcountryama;
	
	@FindBy(xpath = "//*[@id='countryDropdown']/option[2]")
	public WebElement addcountryafg;
	
	@FindBy(id = "fullNameInput")
	public WebElement addfullname;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement addphonenum;
	
	@FindBy(id = "streetInput")
	public WebElement addstreet;
	
	@FindBy (id = "apartmentInput")
	public WebElement aptnum;
	
	@FindBy(id = "cityInput")
	public WebElement addcity;
	
	@FindBy(xpath = "//select[@whitelist='[object Object]']")
	public WebElement addstate;
	
	@FindBy(xpath = "//select[@whitelist='[object Object]']/option[15]")
	public WebElement addkblcity;
	
	@FindBy(xpath = "//select[@whitelist='[object Object]']/option[2]")
	public WebElement addcitytutila;
	
	@FindBy(id = "zipCodeInput")
	public WebElement addzipcode;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addaddedsuccess;
	
	@FindBy(xpath = "//button[@class='account__address-btn'][1]")
	public WebElement editaddlink;
	                
	
	@FindBy(xpath = "//select[@id='countryDropdown']/option[237]")
	public WebElement editcountryusa;
	
	@FindBy(xpath = "//select[@whitelist='[object Object]']/option[7]")
	public WebElement editstateca;
	
	@FindBy(xpath = "//button[@class='account__address-btn'][2]")
	public WebElement removeaddlink;
	
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addpaymentBtn;
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//img[@class='w-full undefined']")
	public WebElement cardpresent;
	
	@FindBy(xpath = "//*[text()='Order Placed, Thanks']")
	public WebElement orderplaced;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexicon;
	
	@FindBy(xpath = "//div[@class='account__payment-sub']/p")
	public List<WebElement> cardendingnumber;
	
	
	 	
	
	
	
	
	
	
	

}
