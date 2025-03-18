package com.zoho.CRM.generic.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.CRM.generic.BaseTest.BaseTest;
import com.zoho.CRM.generic.webDriverUtility.webDriverUtility;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="userName")
	private WebElement userNameTextField;
	
	@FindBy(id="passWord")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@alt=\"Sign In\"]")
	private WebElement signInButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	// business library
	public void loginToApp(String url,String username,String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.manage().window().maximize();
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		signInButton.click();
		
	}
	
	
	
	
}
