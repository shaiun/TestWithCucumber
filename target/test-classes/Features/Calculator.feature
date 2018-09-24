Feature: Dividing numbers with a Calculator

Scenario:  Divide two positive numbers
	Given I have a Calculator
  When I divide 60 by 20
  Then the quotient should be 3
  
Scenario: Divide one positive number by zero
	Given I have a Calculator
  When I divide 7 by zero
  Then I got Exception ArithmeticException
  
Scenario:  Divide one positive number by one negative number
	Given I have a Calculator
  When I divide 7 by -2
  Then the quotient should be -3	

Scenario:  Divide one negative number by one positive number
	Given I have a Calculator
  When I divide -7 by 2
  Then the quotient should be -3	
  
Scenario:  Divide one negative number by one negative number
	Given I have a Calculator
  When I divide -7 by -2
  Then the quotient should be 3	
 
  