package AutoTest.OurFirstProject;
import org.openqa.selenium.WebDriver;

import Interface_Pages.Login_Page;

import Util.Reusable_methods;
import Util.drivers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// Re usability 
public class LoginStepDef implements Login_Page {
	
	// 3 types of selectors are been use for this test
	// ID is been use,link text,Name
	WebDriver driver;
	drivers setdriver = new drivers();
	Reusable_methods login_obj = new Reusable_methods();
	
@Before
public void startsession(){
	setdriver.manage_browser("FF");
}
	
	@Given("^am on the Landing Page$")
	public void am_on_the_Landing_Page() throws Throwable {
	  login_obj.launch_url(Base_Url);  
	}

	@Given("^I enter my username and password$")
	public void i_enter_my_username_and_password() throws Throwable {
	 login_obj.TextField("usernamelogin", "wegit");
	 login_obj.TextField("loginPassword", "12345678");
	}

	@Given("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
	 login_obj.do_click("LoginBtn");
	   
	}

	@When("^I should see the Home Page$")
	public void i_should_see_the_Home_Page() throws Throwable {
	 login_obj.assert_text("Home");
	}

	@When("^I click logout$")
	public void i_click_logout() throws Throwable {
	    login_obj.click_link_text("Logout"); 
	    
	}

	@Then("^I should be on the Landing Page$")
	public void i_should_be_on_the_Landing_Page() throws Throwable {
		login_obj.assert_text("Login");
 
	}


@After
public void closenamebrowser(){
	setdriver.closebrowser();
	

}
}

