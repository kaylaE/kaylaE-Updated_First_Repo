package AutoTest.OurFirstProject;

import Util.Reusable_methods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BJ_JourneyStep  {
	
	Reusable_methods book_your_j_obj = new Reusable_methods();
	
	@Given("^I enter my start destination$")
	public void i_enter_my_start_destination() throws Throwable {
		book_your_j_obj.TextField("#q1","Monaco" );
	
	}}

	/*@Given("^I enter my end destination$")
	public void i_enter_my_end_destination() throws Throwable {
	 book_your_j_obj.TextField("#q2","Necker" );
	}

	@Given("^I select a zone$")
	public void i_select_a_zone() throws Throwable {
	   book_your_j_obj.do_click("#q15", "US");
	   
	}

	@When("^I click the relevant check box$")
	public void i_click_the_relevant_check_box() throws Throwable {
	   book_your_j_obj.do_click("#checkbox1",".//form/input[6]" );
	
	}

	@When("^I select no radio button$")
	public void i_select_no_radio_button() throws Throwable {
		book_your_j_obj.do_click(".//form/input[10]");
		
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		book_your_j_obj.do_click("#a1");
		
	}

	@Then("^a successfull confirmation message is displayed$")
	public void a_successfull_confirmation_message_is_displayed() throws Throwable {
	    book_your_j_obj.assert_text("Thank you for completing the form. We shall get back to you soonest.");
	    	}


}*/
