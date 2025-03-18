package com.zoho.CRM.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignListPage {
	WebDriver driver;
	
	public CampaignListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@value=\"New Campaign\"]")
	private WebElement newCampaignButton;
	
	@FindBy(name = "searchString")
	private WebElement findCampaignsField;
	
	@FindBy(name = "Go")
	private WebElement goButton;
	
	public WebElement getNewCampaignButton() {
		return newCampaignButton;
	}

	public WebElement getFindCampaignsField() {
		return findCampaignsField;
	}

	public WebElement getGoButton() {
		return goButton;
	}
	
	
}
