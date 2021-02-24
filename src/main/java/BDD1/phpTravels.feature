Feature: sign up
Scenario: Sign up to the phpTravels
	Given User is on the application page
	When Application page title is "PHPTRAVELS | Travel Technology Partner"
	Then navigate to SignUp page
	Then fill the sign up form
		| Clinton | Dsouza | 987654321 | clni@gmail.com | nik@123 | nik@123 |
	Then validate correct inputs are displayed
	And submit the signup form 
	Then Quit the driver 
	
