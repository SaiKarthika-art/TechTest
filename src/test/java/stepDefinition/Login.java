package stepDefinition;

import java.io.IOException;

import com.qa.customExtentReport.CustomExtentReporter;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends TestBase {

	LoginPage loginpage;
	
	private static CustomExtentReporter customExtentReporter;
	private static boolean isReporterRunning;
	
	
	@Before()
	public void beforeScenario(Scenario scenario) {
		if(!isReporterRunning) {
			customExtentReporter = new CustomExtentReporter("C:\\SaiKarthi\\Code Repositories\\Java\\TechTest\\target\\TestReport.html");
			isReporterRunning = true;
		}
		
	}

	@Given("user navigates to the URL")
	public void user_navigates_to_the_URL() {
		TestBase.initiaization();
	}

	@When("user does not enter email and password")
	public void user_does_not_enter_email_and_password() {
		loginpage = new LoginPage();
		loginpage.click_SignIn();
	}

	@Then("email and password required error message should be displayed")
	public void email_and_password_required_error_message_should_be_displayed() {
		loginpage = new LoginPage();
		String emailerror = loginpage.emailReqErrValn();
		String passerror = loginpage.passwordReqErrValn();
		System.out.println("Error Message of blank entry for email is : " + emailerror);
		System.out.println("Error Message of blank entry for password is : " + passerror);

	}

	@When("user enters incorrect \"(.*)\" or \"(.*)\"")
	public void user_enters_incorrect_or(String email, String password) {
		loginpage = new LoginPage();
		loginpage.enterEmailAndPass(email, password);
		loginpage.click_SignIn();
	}

	@Then("Incorrect email or password error message should be displayed")
	public void incorrect_email_or_password_error_message_should_be_displayed() {
		loginpage = new LoginPage();
		String incErr = loginpage.incorrectCredentialsErrValn();
		System.out.println("Error Message of incorrect entry is : " + incErr);
	}

	@When("user enters incorrect \"(.*)\" or \"(.*)\" three times in a row with same email")
	public void user_enters_incorrect_or_three_times_in_a_row_with_same_email(String email, String password) {
		loginpage = new LoginPage();
		for (int i = 0; i < 3; i++) {
			loginpage.enterEmailAndPass(email, password);
			loginpage.click_SignIn();
		}

	}

	@Then("Account lockout popup should be displayed")
	public void account_lockout_popup_should_be_displayed() {
		loginpage = new LoginPage();
		boolean popup = loginpage.accountLockout();
		if (popup) {
			String popuphdr = loginpage.accountLockWarning();
			String popupcnt = loginpage.accountLockContent();
			System.out.println("Error Message of three consecutive attemps header is : " + popuphdr);
			System.out.println("Error Message of three consecutive attemps content is : " + popupcnt);
		}
		//loginpage.click_Close();
	}

	@When("user enters incorrect \"(.*)\" or \"(.*)\" five times in a row with same email")
	public void user_enters_incorrect_or_five_times_in_a_row_with_same_email(String email, String password) throws InterruptedException {
		loginpage = new LoginPage();
		for (int i = 0; i < 5; i++) {
			loginpage.enterEmailAndPass(email, password);
			loginpage.click_SignIn();
			if(i==2) {
				loginpage.click_Close();
			}
		}

	}

	@Then("Account has locked message should be displayed")
	public void account_has_locked_message_should_be_displayed() {
		loginpage = new LoginPage();
		boolean popup = loginpage.accountLockout();
		if (popup) {
			String popuphdr = loginpage.accountLockWarning();
			String popupcnt = loginpage.accountLockContent();
			System.out.println("Error Message of three consecutive attemps header is : " + popuphdr);
			System.out.println("Error Message of three consecutive attemps content is : " + popupcnt);
		}
	//	loginpage.click_Close();
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException {
		
		String screenshotFileName = "C:\\SaiKarthi\\Code Repositories\\Java\\TechTest\\target" + scenario.getName().replaceAll(" ", "") +  ".jpeg";
		if(scenario.isFailed()) {
			//scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			customExtentReporter.takeScreenshot(screenshotFileName);
		}customExtentReporter.createTest(scenario, screenshotFileName);
		customExtentReporter.writeToReport();
		driver.quit();
	}

}