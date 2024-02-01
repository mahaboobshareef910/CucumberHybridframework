package pagesforGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.AccountSuccessPage;
import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterTourMercuryPage {
WebDriver driver;
private CommonUtils commonutilis;
private ElementUtils elementutils;
public RegisterTourMercuryPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 elementutils = new ElementUtils(driver);
}
@FindBy(xpath="//*[@href='register.php']")
private WebElement registerOption;
public void ClickonRegisterPage() {
	elementutils.javaScriptClick(registerOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='firstName']")
private WebElement FirstName;
public void enterFirstName(String firstname) {
	elementutils.typeTextIntoElement(FirstName, firstname,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='lastName']")
private WebElement Lastname;
public void EnterLastname(String lastname) {
	elementutils.typeTextIntoElement(Lastname, lastname,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='phone']")
private WebElement phone;
public void EnterphoneNumber(String phonenumber) {
	elementutils.typeTextIntoElement(phone,phonenumber,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='userName']")
private WebElement Email;
public void EnterEmail(String emailText) {
	elementutils.typeTextIntoElement(Email,emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='address1']")
private WebElement Address;
public void EnterAddress(String addressText) {
	elementutils.typeTextIntoElement(Address,addressText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='city']")
private WebElement city;
public void EntercityName(String cityText) {
	elementutils.typeTextIntoElement(city,cityText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='state']")
private WebElement State;
public void EnterStateName(String stateText) {
	elementutils.typeTextIntoElement(State,stateText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='postalCode']")
private WebElement postalCode;
public void EnterPostalcode(String postalcodeText) {
	elementutils.typeTextIntoElement(postalCode,postalcodeText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='country']")
private WebElement country;
public void Entercountry() {
	elementutils.clickOnElement(country,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='email']")
private WebElement username;
public void EnterUserName(String usernameText) {
	elementutils.typeTextIntoElement(username,usernameText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='password']")
private WebElement password;
public void Enterpassword(String passwordText) {
	elementutils.typeTextIntoElement(password,passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
@FindBy(xpath="//*[@name='confirmPassword']")
private WebElement confirmpassword;
public void EnterConfirmpassword(String cnfmpasswordText) {
	elementutils.typeTextIntoElement(confirmpassword,cnfmpasswordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}

@FindBy(xpath="//*[@name='submit']")
private WebElement finallysubmit;
public AccountSuccessPage fianllyuserSubmitt() {
	elementutils.clickOnElement(finallysubmit,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	return  new AccountSuccessPage(driver);
}
}