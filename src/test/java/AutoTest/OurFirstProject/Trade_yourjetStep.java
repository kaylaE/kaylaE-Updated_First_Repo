package AutoTest.OurFirstProject;

import Util.Reusable_methods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trade_yourjetStep{
	
	Reusable_methods trade_your_j_obj = new Reusable_methods();

	@When("^I click the trade your jet tab$")
	public void i_click_the_trade_your_jet_tab() throws Throwable {
		trade_your_j_obj.do_click("#TradeYourJetTab>a");
	}

	@When("^I enter current jet price$")
	public void i_enter_current_jet_price() throws Throwable {
		trade_your_j_obj.TextField("q1", "1500000");
	}

	@When("^I enter purchase price$")
	public void i_enter_purchase_price() throws Throwable {
		trade_your_j_obj.TextField("q2", "400000000"); 
	}

	@When("^I enter flight time$")
	public void i_enter_flight_time() throws Throwable {
		trade_your_j_obj.TextField("q3", "120000");
	}

	@When("^I select the relevant radio button$")
	public void i_select_the_relevant_radio_button() throws Throwable {
		trade_your_j_obj.do_click("q5");	    
	}

	@When("^Click submit$")
	public void click_submit() throws Throwable {
		trade_your_j_obj.do_click("a1");
	}

	@Then("^I should see a successfull message$")
	public void i_should_see_a_successfull_message() throws Throwable {
		trade_your_j_obj.assert_text("Thank you for your Message! We will get in touch as soon as possible.");
	}


}
