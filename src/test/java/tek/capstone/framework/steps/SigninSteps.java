package tek.capstone.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SigninSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();


	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signin);
		logger.info("User click on sign in option");
		slowDown();
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailvalue, email);
		sendText(factory.signInPage().passwordvalue, password);
		logger.info("User can sign in with " + email + "And " + password);
		slowDown();
	}
	@And("User click on login button")
	public void userClickOnLogingButton () {
		click(factory.signInPage().loginBtn);
		logger.info("User click on loging button");
		slowDown();
	}
		@Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
			Assert.assertTrue(isElementDisplayed(factory.signInPage().accountlink));
			logger.info("user logged in into account");
			slowDown();
			
		}

	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newaccountbtn);
		logger.info("user clicked on Create New Account button");
		
	}
	
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.signInPage().namefeild,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailfeild,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passworfeild,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmepassvalue,signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");
		
		List<List<String>> signup = data.asLists(String.class);
		System.out.println(signup.get(1).get(0)+ " This value is from list +++++++++++++++");
		
		slowDown();
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signupBtn);
		logger.info("user clicked on Sign up Button");
		slowDown();
	}

	@Then("User should be logged into new account page")
	public void userShouldBeLoggedIntoNewAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountlogo));
		logger.info("Account was created");
		slowDown();
	
		
	}
	
}



	
	

