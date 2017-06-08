Feature: As a user
I want to be able to click
on all the Navigation Pane


Background: Login     
Given am on the Landing Page
When I enter my username and password
Then I click Login button

@Reg
Scenario: Click trade your jet tab
When I click the trade your jet tab
Then I should be on trade your jet page

@Reg
Scenario: Click book your jet 
When I click the book your jet tab
Then I should be on the book your jet page

@Reg
Scenario: Click just trade
When I click the just trade tab
Then I should be on just trade page

@Reg
Scenario: Click about us
When I click the about us tab
Then I should be on the about us page

@Reg
Scenario: Click contact us
When I click the contact us tab
Then I should be on the contact us page