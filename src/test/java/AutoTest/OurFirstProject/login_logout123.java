package AutoTest.OurFirstProject;

import org.openqa.selenium.WebDriver;

import Interface_Pages.Login_Page;
import Util.Reusable_methods;
import Util.drivers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class login_logout123 implements Login_Page{
	WebDriver driver;
	Reusable_methods main_login = new Reusable_methods();
	drivers set_main_driver =  new drivers();
	
	@Before
	public void startsession(){
		set_main_driver.manage_browser("FF");
	}
	@Given("^am on the \"([^\"]*)\" Page$")
	public void am_on_the_Page(String page) throws Throwable {
	   switch (page){
	   case "Landing":
		   main_login.launch_url(Base_Url); 
		   main_login.assert_text("Login");
		   break;
	   case "Home":
		   main_login.assert_text("Login"); 
		   break;
		   
		default:
			break;
	   
	   }
	  
	
	}
	@Given("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_my_as(String user_input, String value) throws Throwable {
	    switch (user_input) {
	    case "Username":
	      	main_login.TextField("usernamelogin", value); 	
	       break;
	    case "Password":
	    	main_login.TextField("loginPassword", value); 	
	    	break;
	    	default:
	    		break;
	    		
	       
	    }
	}

	@When("^I click \"([^\"]*)\" button$")
	public void i_click_button(String buttons) throws Throwable {
		   switch (buttons) {
		    case "Login":
		      	main_login.do_click("LoginBtn"); 	
		       break;
		     default:
		    	 break;  
		   }  
	}
	@When("^I click logout link$")
	public void i_click_logout_link(String link) throws Throwable {
		 switch (link) {
		    case "Logout":
		      	main_login.click_link_text("Logout"); 	
		       break;
		     default:
		    	 break;  
		   }  
	}



	@After
	public void closenamebrowser(){
		set_main_driver.closebrowser();


	}
}


/// My phone is gone, see you later