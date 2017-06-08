Feature: As a user,
I want to be able to Login and Logout
 
@Reg
Scenario Outline: Login and Logout
Given am on the "Landing" Page
And I enter my "Username" as "wegit" 
And I enter my "Password" as "12345678"
When I click "Login" button
And am on the "Home" Page
And I click logout 
Then am on the "Landing" Page

Examples:
| Username | Password |
| wegit    | 12345678 |
|super001  | 12345678 |
|auto001   | 12345678 |

