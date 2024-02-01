package pagesforGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePageModulesGuru {
WebDriver driver;
private ElementUtils elementUtils;
public HomePageModulesGuru(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	elementUtils = new ElementUtils(driver);
}
@FindBy(linkText="New Tours")
private WebElement NewTourOption;
public void SelectNewTourOption() {
	elementUtils.clickOnElement(NewTourOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
}
