package tek.capstone.framework.steps;



import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	 private POMFactory factory = new POMFactory();
	 
	 @When("User click on Orders section")
	 public void userClickOnOrdersSection() {
		 click(factory.orderpage().orderlink);
		 logger.info("User clicked on ordersection");
	  
	 }
	 @When("User click on Cancel The Order button")
	 public void userClickOnCancelTheOrderButton() {
		 click(factory.orderpage().cancelBtn);
		 logger.info("User cancelled the Item");
	 }

	 @When("User select the cancelation Reason {string}")
	 public void userSelectTheCancelationReasonBoughtWrongItem(String val) {
		 click(factory.orderpage().cancelreason);
		 selectByVisibleText(factory.orderpage().cancelreason, val);
		 logger.info("user canceled the order");
		 slowDown();
	    
	 }

	 @And("User click on Cancel Order button")
	 public void userClickOnCancelOrderButton() {
		 click(factory.orderpage().cancelorderbtn);
		 logger.info("user clicked on cancel order Button");
		 slowDown();
	 }
	 @Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	 public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	Assert.assertTrue(isElementDisplayed(factory.orderpage().cancelationmsg));
	logger.info("this message displayed Your Order Has Been Cancelled");
	   
	 }
	 
	 @And("User click on Return Items button")
	 public void userClickOnReturnItemsButton() {
		 click(factory.orderpage().retrurnitemBtn);
		 logger.info("user click on retrurn Item button");
		 slowDown();
		  
	 }
	 @And("User select the Return Reason {string}")
	 public void userSelectTheReturnReasonItemDamaged(String value) {
		 click(factory.orderpage().reasonInpuntBtn);
		 selectByVisibleText(factory.orderpage().reasonInpuntBtn, value);
		 click(factory.orderpage().reasonInpuntBtn);
		 logger.info("user select the retrun reason");
		 slowDown();
	 }
	 
	 @And("User select the drop off service {string}")
	 public void userSelectTheDropOffServiceFedEX(String val) {
		 click(factory.orderpage().dropoffInput);
		 selectByVisibleText(factory.orderpage().dropoffInput, val);
		 click(factory.orderpage().dropoffInput);
		 logger.info("user select FedEx from drop down list");
		 slowDown();
	 }
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderpage().retrunorderbtn);
		logger.info("user clicked on return order button");
		 slowDown();
		
	}
	
	@Then("a cancelation message should be displayed 'Return was successful'")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
	Assert.assertTrue(isElementDisplayed(factory.orderpage().returnwassuccessfull));
	logger.info("a cancelation msg should be displayed");
	slowDown();
	}
	
	@And("User click on Review button")
	public void userClickOnREviewButton() {
		click(factory.orderpage().reviweBtn);
		logger.info("user clicked on Review Button");
		slowDown();
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlin(String val1, String val2) {
		click(factory.orderpage().headlineInput);
		sendText(factory.orderpage().headlineInput, val1);
		click(factory.orderpage().descriptionInput);
		sendText(factory.orderpage().descriptionInput, val2);
		logger.info("User wrote review not");
		slowDown();
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderpage().reviewSubmitBtn);
		slowDown();
	}
	@Then("a review message should be displayed 'Your review was added successfully'")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.orderpage().yourreviewadded));
	logger.info("a review message displayed");
		
	}
	}


