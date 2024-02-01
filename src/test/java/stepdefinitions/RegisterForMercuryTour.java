package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountSuccessPage;
import pagesforGuru99.HomePageModulesGuru;
import pagesforGuru99.RegisterTourMercuryPage;
import utils.CommonUtils;

public class RegisterForMercuryTour {
WebDriver driver;
private CommonUtils commonutils;
private HomePageModulesGuru homepageGuru;
private RegisterTourMercuryPage registertourpage;
private AccountSuccessPage accountsuccesspage;

@Given("user navigate to Register AccountPage")
public void user_navigate_to_register_account_page() {
    driver = DriverFactory.getDriver();
    homepageGuru = new HomePageModulesGuru(driver);
    homepageGuru.SelectNewTourOption();
    registertourpage = new RegisterTourMercuryPage(driver);
    registertourpage.ClickonRegisterPage();
}

@When("user entres the details below fields")
public void user_entres_the_details_below_fields(DataTable dataTable) {
Map<String, String>  datamap = dataTable.asMap(String.class,String.class);  
registertourpage.enterFirstName(datamap.get("firstname"));
registertourpage.EnterLastname(datamap.get("lastname"));
registertourpage.EnterphoneNumber(datamap.get("phoneNumber"));
registertourpage.EnterEmail(datamap.get("email"));
registertourpage.EnterAddress(datamap.get("Address"));
registertourpage.EntercityName(datamap.get("city"));
registertourpage.EnterStateName(datamap.get("state"));
registertourpage.EnterPostalcode(datamap.get("postalcode"));
registertourpage.Entercountry();
registertourpage.EnterUserName(datamap.get("UserName"));
registertourpage.Enterpassword(datamap.get("password"));
registertourpage.EnterConfirmpassword(datamap.get("confirmpassword"));
}

@And("user can click on Submitt")
public void user_can_click_on_submitt() {
	accountsuccesspage=registertourpage.fianllyuserSubmitt();
}

@Then("user can Registered successfully")
public void user_can_registered_successfully() {
	Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.",accountsuccesspage.getPageHeadingRegisterTour());
	System.out.println("Registersuccessfull");
}

}
