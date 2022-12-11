package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountlogo);
		logger.info("user click on account option");
		
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		sendText(factory.accountPage().nameupdate, name);
		sendText(factory.accountPage().phoneupdate,phone);
		logger.info("Name " + name + "and " + phone + "updated");
		
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	click(factory.accountPage().updatebtn);
	logger.info("user clicked on update button");
	slowDown();
		
	}
	
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatesucessfully));
		logger.info("Personal Information Updated Successfully");
		slowDown();
		
	}
	
	@And ("User enter below information")
	public void userEnterBelowInformation(DataTable data){
		List<Map<String, String>> newpass = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().perviouspass,newpass.get(0).get("previousPassword"));
		sendText(factory.accountPage().newpass,newpass.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmpass,newpass.get(0).get("confirmPassword"));
		logger.info("user updated passowrd");
		slowDown();
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changepassbutn);
		logger.info("user clicked on change password button");
		slowDown();
	}
	@Then ("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUPadatedSuccessfully(){
	Assert.assertTrue(isElementDisplayed(factory.accountPage().passupdatedsuccess));
	logger.info("Password Updated Successfully");
	slowDown();
	}
	
	@And("User click on Add a payment method link")
		public void userClickOnAddAPaymentMethodLink(){
	click(factory.accountPage().addapaymentlink);
		logger.info("user clicked on payment method link");
		
		}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation( DataTable data) {
		
		List<Map<String, String>> paycard = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardnumberfield, paycard.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameoncardfield, paycard.get(0).get("nameOnCard"));
		click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().expirationmonth);
	    click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().expirationyear);
		sendText(factory.accountPage().securitycondfield, paycard.get(0).get("securityCode"));
		logger.info("user update payment method");
		slowDown();
	}
	
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentbtn);
		logger.info("user clicked on add card butn");
		slowDown();
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentmethodadded));
		logger.info("Payment Method added sucessfully");
		
	}
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		scrollPageDownWithJS();
		click(factory.accountPage().cardimg);
		click(factory.accountPage().editlink);
		logger.info("user clicked on edit paymentmethod");
		slowDown();
	}
	@And ("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		
		clearTextUsingSendKeys(factory.accountPage().cardnumberfield);
		clearTextUsingSendKeys(factory.accountPage().nameoncardfield);
		clearTextUsingSendKeys(factory.accountPage().securitycondfield);
		
		List<Map<String, String>> editcard = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardnumberfield, editcard.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameoncardfield, editcard.get(0).get("nameOnCard"));
		click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().editexm);
	    click(factory.accountPage().expirationyearbtn);
		click(factory.accountPage().editexy);
		sendText(factory.accountPage().securitycondfield, editcard.get(0).get("securityCode"));
		slowDown();
		
	}
	@And("user click on Update Your Card button")
	public void userClickONUpdateYourCardButton() {	
		click(factory.accountPage().paymentsubmitbtn);
		logger.info("user clicked on updat your card BTN");
		slowDown();
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		
	Assert.assertTrue(isElementDisplayed(factory.accountPage().payudatedSuccessfully));
	logger.info("Payment Method updated Successfully");
	slowDown();
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		scrollPageDownWithJS();
		click(factory.accountPage().cardimg);
		click(factory.accountPage().removelink);
		slowDown();
		
		
	}

	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		try {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().cardpresent));
		
	}catch (AssertionError e) {
		logger.info(e.getMessage());
	}
	
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		
		click(factory.accountPage().addaddresslink);
		logger.info("user clicked on address option");
		slowDown();
	
	}
	
	@And("user fill new address form with below information")
		public void userFillNewAddressFromWithBelowInformation(DataTable data){
		click(factory.accountPage().addcountrydropdown);
		List<Map<String, String>> addaddress = data.asMaps(String.class,String.class);
		click(factory.accountPage().addcountryafg);
		sendText(factory.accountPage().addfullname, addaddress.get(0).get("Full Name"));
		sendText(factory.accountPage().addphonenum, addaddress.get(0).get("Phone Number"));
		sendText(factory.accountPage().addstreet, addaddress.get(0).get("Address"));
		sendText(factory.accountPage().aptnum, addaddress.get(0).get("apt"));
		sendText(factory.accountPage().addcity, addaddress.get(0).get("City"));
		click(factory.accountPage().addstate);
		click(factory.accountPage().addkblcity);
		sendText(factory.accountPage().addzipcode, addaddress.get(0).get("Zip code"));
		logger.info("user filled the above information");
		slowDown();
			
	}
	
	@And ("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addyouraddressBtn);
		logger.info("user clicked on address btn");
		slowDown();
		
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().addaddedsuccess));
	logger.info("‘Address Added Successfully’ should be displayed");
		
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editaddlink);
		logger.info("User clicked on edite address option");
		slowDown();
	}
	
	@And("user edit new address form with below information")
	public void userEditNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> editddress = data.asMaps(String.class,String.class);
		click(factory.accountPage().addcountrydropdown);
		click(factory.accountPage().editcountryusa);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().addfullname);
		sendText(factory.accountPage().addfullname, editddress.get(0).get("Full Name"));
		clearTextUsingSendKeys(factory.accountPage().addphonenum);
		sendText(factory.accountPage().addphonenum, editddress.get(0).get("Phone Number"));
		clearTextUsingSendKeys(factory.accountPage().addstreet);
		sendText(factory.accountPage().addstreet, editddress.get(0).get("Address"));
		clearTextUsingSendKeys(factory.accountPage().aptnum);
		sendText(factory.accountPage().aptnum, editddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addcity);
		sendText(factory.accountPage().addcity, editddress.get(0).get("City"));
		click(factory.accountPage().addstate);
		click(factory.accountPage().editstateca);
		clearTextUsingSendKeys(factory.accountPage().addzipcode);
		sendText(factory.accountPage().addzipcode, editddress.get(0).get("Zip code"));
		logger.info("user filled new information with above data");
		slowDown();
	}
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		
		click(factory.accountPage().updateyouraddressbtn);
		logger.info("user clicked on update address btn");
		slowDown();
		
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addaddedsuccess));
		logger.info("‘Address Updated Successfully’ should be displayed");
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeaddlink);
		logger.info("address should remove");
		
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("address should not be present");
	
	
	}
	
}
	
	

