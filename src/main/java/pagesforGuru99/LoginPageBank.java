package pagesforGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class LoginPageBank {
WebDriver driver;
private CommonUtils commonutlis; 
private ElementUtils elementutils;

public LoginPageBank(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	elementutils = new ElementUtils(driver);
}

@FindBy(xpath="//*[@name='uid']")
private WebElement Username;
public void EnterBankUserName(String texttypeeml) {
	elementutils.typeTextIntoElement(Username, texttypeeml,commonutlis.EXPLICIT_WAIT_BASIC_TIME);
}

@FindBy(xpath="//*[@name='password']")
private WebElement password;
public void EnterBankPassword(String texttypepaswrd) {
	elementutils.typeTextIntoElement(password, texttypepaswrd,commonutlis.EXPLICIT_WAIT_BASIC_TIME);
}

@FindBy(xpath="//*[@name='btnLogin']")
private WebElement loginbutton;
public void ClickOnLogin() {
	elementutils.javaScriptClick(loginbutton,commonutlis.EXPLICIT_WAIT_BASIC_TIME);
}

}
