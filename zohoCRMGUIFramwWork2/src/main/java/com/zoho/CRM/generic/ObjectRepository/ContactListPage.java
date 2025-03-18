package com.zoho.CRM.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListPage {
	
	WebDriver driver;

	public ContactListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value=\"New Contact\"]")
	private WebElement newContactButton;
	
	@FindBy(name = "searchString")
	private WebElement findContactsField;
	
	@FindBy(name = "Go")
	private WebElement goButton;

	public WebElement getNewContactButton() {
		return newContactButton;
	}

	public WebElement getFindContactsField() {
		return findContactsField;
	}

	public WebElement getGoButton() {
		return goButton;
	}
	
	
}
