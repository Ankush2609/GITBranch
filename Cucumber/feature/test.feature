Feature: 	Login
Scenario Outline:	Login with valid Credential
Given 		Username as "Admin" & Password as "Password"
Given 		Username as "User" & Password as "Password"
When 		User Enters Username & password
And 		Click on "<Button>" button
But 		Not click reset button 
Then 		Login should be successful
Then 		add items to cart
| Catagery    | Brand |
| mobile      | Nokia |
| mobile      | Mi    |

Examples:
|Button|
|Login|
|Submit|