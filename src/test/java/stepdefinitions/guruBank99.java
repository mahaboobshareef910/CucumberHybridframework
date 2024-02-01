package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagesforGuru99.LoginPageBank;
import utils.CommonUtils;

public class guruBank99 {
	WebDriver driver;
	private LoginPageBank loginpage;
	private CommonUtils commonUtils;
	
	@Given("user navigate to loginpage")
	public void user_navigate_to_loginpage() {
	    driver = DriverFactory.getDriver();
	    loginpage = new LoginPageBank(driver);
	}

	@Given("user enter valid email {string}")
	public void user_enter_valid_email(String emailtext) {
	    loginpage.EnterBankUserName(emailtext);;
	}

	@Given("user enter valid password {string}")
	public void user_enter_valid_password(String passwordtext) {
	    loginpage.EnterBankPassword(passwordtext);;
	}

	@Then("user successfully in AccountPage")
	public void user_successfully_in_account_page() {
	    loginpage.ClickOnLogin();
	}

}
