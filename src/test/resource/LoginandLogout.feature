Feature: As a user,
I want to be able to Login and Logout
 
@Reg
Scenario: Login and Logout
Given am on the Landing Page
And I enter my username and password
And I click Login button
When I should see the Home Page
And I click logout 
Then I should be on the Landing Page