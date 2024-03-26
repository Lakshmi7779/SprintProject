Feature: 99acres website registration and Login

Scenario: URL successful
Given I am on the login page of the website
When I enter URL of the website
And I enter
Then I should successfully redirected to home page

Scenario: Login Successful
Given I am on login page
When I enter mobile number
And click on continue
And I should receive an otp on my mobile number
And I enter the received valid OTP
Then I login to home page


Scenario: Login Unsuccessful
Given I am on login page
When I enter new Mobile Number
And click on continue
And it states a message "Kindly Register"
Then click on Register


Scenario: Registration succesful
When I am on Registration Page
And I enter name
And I should enter the Email
And I should enter the password
And I enter mobile number
And check the agreement box
Then click on Register


Scenario: Registration with an invalid OTP
When I enter invalid OTP
And I should receive alert message "OTP is incorrect"
Then I should click on resend OTP


Scenario: Registration  UnSuccessful
Given I am on Registration page
When I enter name
And I should enter the invalid Email
And I should enter the password
And I enter mobile number
And check the agreement box
And I click Register
Then I should see an error message stating "email should be min 8 characters"


Scenario Outline: Login Successful
Given I am on 99Acres Login Page
When I enter email as <email>
And I enter password as <password>
And I click Login
Then I am Logged in Successfully


	Examples:   
	|email      | password     | 
      | "dolalakshmi28@gmail.com" | "lakshmi@123"   |
      | "sriramsindhu5a7@gmail.com" | "Sindhu"     |
      | "poojithabhupathiraju345@gmail.com"  | "poojitha"  |
     