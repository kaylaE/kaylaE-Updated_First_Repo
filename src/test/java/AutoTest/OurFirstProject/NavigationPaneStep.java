package AutoTest.OurFirstProject;

import Util.Reusable_methods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationPaneStep {
	
	Reusable_methods navigation_obj = new Reusable_methods();
	
	@Then("^I should be on trade your jet page$")
	public void i_should_be_on_trade_your_jet_page() throws Throwable {
		navigation_obj.assert_text( ".content-header");
	    
	}
	@When("^I click the book your jet tab$")
	public void i_click_the_book_your_jet_tab() throws Throwable {
		navigation_obj.do_click("#bookyourjettab>a");
	
	}
	@Then("^I should be on the book your jet page$")
	public void i_should_be_on_the_book_your_jet_page() throws Throwable {
		navigation_obj.assert_text( ".content-header");
		
	}
	
	@When("^I click the just trade tab$")
	public void i_click_the_just_trade_tab() throws Throwable {
		navigation_obj.do_click("#justtradetab>a");
		
	}
	
	@Then("^I should be on just trade page$")
	public void i_should_be_on_just_trade_page() throws Throwable {
		navigation_obj.assert_text( ".content-header");
		
	}
	
	@When("^I click the about us tab$")
	public void i_click_the_about_us_tab() throws Throwable {
		navigation_obj.do_click("#aboutustab>a");
	}
	
	@Then("^I should be on the about us page$")
	public void i_should_be_on_the_about_us_page() throws Throwable {
		navigation_obj.assert_text( ".content-header");
		
	}

	@When("^I click the contact us tab$")
	public void i_click_the_contact_us_tab() throws Throwable {
		navigation_obj.do_click("#contactsupporttab>a");

	}

	@Then("^I should be on the contact us page$")
	public void i_should_be_on_the_contact_us_page() throws Throwable {
		navigation_obj.assert_text( ".content-header");
		
		
	}


}
