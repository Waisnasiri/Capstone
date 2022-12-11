package tek.capstone.framework.steps;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.pages.POMFactory;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@Then("User verify retail page logo is present")
	public void userVerifyRetailPageLogoIsPresent() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().accountlogo));
	logger.info("logo is present");

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allsection);
		logger.info("user click on all section");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable Data) {
	
		if (factory.homePage().electronicsection.getText().equals("Electronics"));	
		getText(factory.homePage().electronicsection);
		logger.info("The Electronics is persent");

		if (factory.homePage().computersection.getText().equals("Computers"));	
		getText(factory.homePage().computersection);
		logger.info("The Computers is persent");

		if (factory.homePage().smarthomesection.getText().equals("Smart Home"));	
		getText(factory.homePage().smarthomesection);
		logger.info("The Smart Home is persent");

		if (factory.homePage().sportsection.getText().equals("Sports"));	
		getText(factory.homePage().sportsection);
		logger.info("The Smart Sport is persent");
			
		}
		
		
		@Then("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable data) {
		
	}

	@When("User on Electronics")
	public void userOnElectronics() {
		click(factory.homePage().electronicsection);
		if (factory.homePage().electvvideo.getText().equals("TV & Video"));
		if (factory.homePage().elecvideogames.getText().equals("Video Games"));
		click(factory.homePage().submenubtn1);

	}

	@When("User on Computers")
	public void userOnComputers() {
		click(factory.homePage().computersection);
		if (factory.homePage().computeraccessories.getText().equals("Accessories"));	
		if (factory.homePage().computernetworking.getText().equals("Networking"));	
		slowDown();
		click(factory.homePage().submenubtn1);

	}

	@When("User on Smart Home")
	public void userOnSmartHome() {
		click(factory.homePage().smarthomesection);
		if (factory.homePage().smarthomelighning.getText().equals("Smart Home Lightning"));	
		if (factory.homePage().smarthomeplugs.getText().equals("Plugs and Outlets"));	
		slowDown();
		click(factory.homePage().submenubtn1);

	}

	@When("User on Sports")
	public void userOnSports() {
		click(factory.homePage().sportsection);
		if (factory.homePage().sportathletic.getText().equals("Athletic Clothing"));	
		if (factory.homePage().sportecercise.getText().equals("Exercise & Fitness"));	
		slowDown();
		click(factory.homePage().submenubtn1);

	}

	@When("User on Automotive")
	public void userOnAutomotive() {
		click(factory.homePage().automaticsection);
		if (factory.homePage().automativparts.getText().equals("Automative Parts & Accessories"));	
		if (factory.homePage().automativmotorcycle.getText().equals("MotorCycle & Powersports"));
		logger.info("user verfiyed the above elements are present");
	}

	@And("User change the category to {string}")
		public void userChangeTheCategoryTo(String value) {
			selectByVisibleText(factory.homePage().allDepartments,value);
			logger.info(value + " was selected from the drop down");
		
	}
	@And("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField,value);
		logger.info("user entered "+value);
		slowDown();
		
	}
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("user clicked on search button");
		slowDown();
	}
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().kasaoutdoor);
		logger.info("user clicked on Kasa outdoor smart plug");
		slowDown();
	}


	@When("User select quantity {string}")
	public void userSelectQuantity(String value) {
	click(factory.homePage().dropdownqty);
	selectByValue(factory.homePage().dropdownqty, value);
	logger.info(value + " was selected from the drop down");
		slowDown();
	}
	@And ("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addtocartBtn);
		logger.info("User added the itmes into cart");

	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String str) {
		String expectedValue = str;
		String actualValue = getElementText(factory.homePage().cartqtity);
		Assert.assertEquals(expectedValue, actualValue);;
	  logger.info("The cart value changed to '2'");
		
}
	@And("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.homePage().cartBtn);
	   logger.info("user clicked on cart button");
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		  click(factory.homePage().proceedBtn);
		   logger.info("user clicked on cart processed button");
		   slowDown();
	}
	@When("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.accountPage().addressBtnlink);
		logger.info("user clicked on address link");
		
	}
		
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data ) {
		click(factory.accountPage().addcountrydropdown);
		List<Map<String, String>> addressinfo = data.asMaps(String.class,String.class);
		click(factory.accountPage().addcountryama);
		sendText(factory.accountPage().addfullname, addressinfo.get(0).get("Full Name"));
		sendText(factory.accountPage().addphonenum, addressinfo.get(0).get("Phone Number"));
		sendText(factory.accountPage().addstreet, addressinfo.get(0).get("Address"));
		sendText(factory.accountPage().aptnum, addressinfo.get(0).get("apt"));
		sendText(factory.accountPage().addcity, addressinfo.get(0).get("City"));
		click(factory.accountPage().addstate);
		click(factory.accountPage().addcitytutila);
		sendText(factory.accountPage().addzipcode, addressinfo.get(0).get("Zip Code"));
		click(factory.accountPage().addyouraddressBtn);
		logger.info("User added a new address");
		slowDown();
	}
	
	@And ("User Click on add payment card")
	public void userClcikOnAddPaymentCard() {
		click(factory.accountPage().addpaymentBtn);
		logger.info("user clicked on payment card");
		slowDown();
	}

	@And("User Add a credit card or Debit Card for Payment method")
	public void userAddACreditCardOrDebitCardForPaymentMethod(DataTable card) {
		List<Map<String, String>> paymenttype = card.asMaps(String.class,String.class);
		click(factory.accountPage().cardnumberfield);
		sendText(factory.accountPage().cardnumberfield, paymenttype.get(0).get("Card Number"));
		click(factory.accountPage().nameoncardfield);
		sendText(factory.accountPage().nameoncardfield, paymenttype.get(0).get("Name on Card"));
		click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().expirationyear);
		click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().expirationmonth);
		sendText(factory.accountPage().securitycondfield, paymenttype.get(0).get("Security Code"));
		logger.info("user add payment method");
		slowDown();
	}
	
	    @And("User click on Place Your Order")
     	public void userClickOnPlaceYourOrder() {
		click(factory.accountPage().placeOrderBtn);
		logger.info("user clicked on placed order button");
		}
	
	    @And("User click on itemes")
		public void userClickOnItemes() {
			click(factory.accountPage().apexicon);
			logger.info("User click on items");
	    }
	@And("a message should be displayed 'Order Placed, Thanks'")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().orderplaced));
		logger.info("Order Placed Successfully");
		slowDown();
}
	
	   

	}
	
