package com.zoho.CRM.generic.webDriverUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.zoho.CRM.generic.BaseTest.BaseTest;

public class webDriverUtility {

	public WebDriver driver;
	WebElement ele;

	public void getTitle() {
		driver.getTitle();
	}

	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public void waitPageToLoad() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void close() {
		driver.close();
	}

	public void quite() {
		driver.quit();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public String switchTOWindow(String Window) {
		driver.switchTo().window(Window);
		return Window;
	}

	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	Actions action = new Actions(driver);

	public void moveToElement(WebElement ele) {
		action.moveToElement(ele).build().perform();
	}

	public void doubleClick() {
		action.doubleClick().build().perform();
	}

	public void doubleClick(WebElement ele) {
		action.doubleClick(ele).build().perform();
	}

	public void contextClick() {
		action.contextClick().build().perform();
	}

	public void contextClick(WebElement ele) {
		action.contextClick(ele).build().perform();
	}

	public void dragAndDrop(WebElement src, WebElement dst) {
		action.dragAndDrop(src, dst).build().perform();
	}

	public void clickAndHold() {
		action.clickAndHold().build().perform();
	}

	public void clickAndHold(WebElement ele) {
		action.clickAndHold(ele).build().perform();
	}

	public void scrollByAmount(int x, int y) {
		action.scrollByAmount(x, y).build().perform();
	}

	public void scrollToWebElement(WebElement ele) {
		action.scrollToElement(ele).build().perform();
	}

	public void sendKeys(String data) {
		action.sendKeys(data).build().perform();
	}

	public void keyDown(String key) {
		action.keyDown(key).build().perform();
	}

	public void keyUp(String key) {
		action.keyUp(key).build().perform();
	}
	
	Select select = new Select(ele);

	public void selectByIndex(int index) {
		select.selectByIndex(index);
	}

	public void selectByVisibleText(String enterText) {
		select.selectByVisibleText(enterText);
	}

	public void selectByValue(String value) {
		select.selectByValue(value);
	}

	public void deselectByValue(String value) {
		select.deselectByValue(value);
	}

	public void deselectByname(String enterText) {
		select.deselectByVisibleText(enterText);
	}

	public void deselectByindex(int index) {
		select.deselectByIndex(index);
	}

	public void getOptions() {
		select.getOptions();
	}
}
