package com.zoho.CRM.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {

	WebDriver driver;

	public CampaignDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "value_Campaign Name")
	private WebElement campaignName;
	
	@FindBy(xpath = "//td[@class=\"title hline\"]")
	private WebElement campaignDetailsPageHeading;

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getCampaignDetailsPageHeading() {
		return campaignDetailsPageHeading;
	}
	
	

}
