package stepdefenations;


import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Pagepath.pagep;
import Utilities.ReportingManager;
import basepage.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination extends pagep{
	
	//@Before
	//public void launchapp() {
		//baseclass.launchApplication();
	//}
	//@After
	//public void closewindow() {
	//	closebrowser();
	//}

	@Given("^User is in login page$")
	public void user_is_in_login_page() throws IOException {
		baseclass.launchApplication();
		ExtentCucumberAdapter.addTestStepLog("application launched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	   
	}

	@When("^User enters email id \"([^\"]*)\"$")
	public void user_enters_email_id(String arg1) throws IOException {
		enterEmailId(arg1);
		ExtentCucumberAdapter.addTestStepLog(" User entered the emaild successfully"+arg1);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	    
	}

	@And("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws IOException {
		enterPassword(arg1);
		ExtentCucumberAdapter.addTestStepLog(" User entered the password successfully"+arg1);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	}

	@And("^User clicks the signin button$")
	public void user_clicks_the_signin_button() throws IOException {
		clickSigninButton() ;
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	}
	
	@Then("User should see the error message")
	public void user_should_see_the_error_message() throws InterruptedException 
	{
		String actual=captureErrorMessage();
		String expected="Invalid email or password.";
		if(actual.equals(expected))
		{
			System.out.println("Testcase passed");
			
		}
		else
		{
			System.out.println("Testcase failed");
		}

	   Thread.sleep(2000);
	}

	@Then("^close application$")
	public void close_application() {
		closebrowser();
	   
	}

}
