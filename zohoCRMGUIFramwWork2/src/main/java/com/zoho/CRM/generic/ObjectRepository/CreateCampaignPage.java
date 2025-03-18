package com.zoho.CRM.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	WebDriver driver;

	public CreateCampaignPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "property(Campaign Name)")
	private WebElement campaignNameTextField;

	@FindBy(name = "property(Start Date)")
	private WebElement startDateTextField;

	@FindBy(name = "property(End Date)")
	private WebElement endDateTextField;
	
	@FindBy(xpath = "//input[@value=\"Save\"]")
	private WebElement saveButton;
	
	@FindBy(name = "property(Type)")
	private WebElement typeDropdownList;
	
	
	public WebElement getTypeDropdownList() {
		return typeDropdownList;
	}

	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getStartDateTextField() {
		return startDateTextField;
	}

	public WebElement getEndDateTextField() {
		return endDateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
}
