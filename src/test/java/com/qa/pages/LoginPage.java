package com.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR

	// static xpath
	@FindBy(id = "user_email")
	WebElement txtEmail;

	@FindBy(id = "user_password")
	WebElement txtPassword;

	@FindBy(xpath = "//*[@name='commit']")
	WebElement btnSignIn;

	@FindBy(xpath = "//*[contains(@class,'mandatory-error')]//li[1]")
	WebElement textEmailRequired;

	@FindBy(xpath = "//*[contains(@class,'mandatory-error')]//li[2]")
	WebElement textPasswordRequired;

	@FindBy(xpath = "//*[contains(@class,'inline-message error')]")
	WebElement textInCorrectCred;

	@FindBy(xpath = "//*[contains(@class,'popupbox-titleBar')]")
	WebElement popupAcctLockout;

	@FindBy(xpath = "//*[contains(@class,'popupbox-titleBar')]/span")
	WebElement textAcctLockout;

	@FindBy(xpath = "//*[text()='I understand']")
	WebElement btnClose;

	@FindBy(xpath = "//span[contains(@id,'recaptcha-anchor')]")
	WebElement chkRobot;

	@FindBy(xpath = "//*[contains(@class,'popupbox-content')]//p[1]")
	WebElement textFiveAttempts;

	// Initializing the page objects

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	// Email and Password left blank
	public void click_SignIn() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((btnSignIn)));
			btnSignIn.click();
			}

	public String emailReqErrValn() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((textEmailRequired)));
		String error = textEmailRequired.getText();
		return error;
	}

	public String passwordReqErrValn() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((textPasswordRequired)));
		String error = textPasswordRequired.getText();
		return error;
	}

	public void enterEmailAndPass(String email, String Password) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((txtEmail)));
		txtEmail.clear();
		txtEmail.sendKeys(email);
		WebDriverWait wat = new WebDriverWait(driver, 30);
		wat.until(ExpectedConditions.visibilityOf((txtPassword)));
		txtPassword.sendKeys(Password);
	}

	public String incorrectCredentialsErrValn() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((textInCorrectCred)));
		String error = textInCorrectCred.getText();
		return error;
	}

	public boolean accountLockout() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((popupAcctLockout)));
		boolean popup = popupAcctLockout.isDisplayed();
		return popup;
	}
	
	public String accountLockWarning() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((textAcctLockout)));
		String error = textAcctLockout.getText();
		return error;
	}
	
	public String accountLockContent() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((textFiveAttempts)));
		String error = textFiveAttempts.getText();
		return error;
	}
	
	public void click_Close() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((btnClose)));
		btnClose.click();
	}
	
	public void click_Robo() {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((chkRobot)));
		chkRobot.click();
	}
	
	
}
