Feature: to send email after doing flipkart actions 

Scenario: to take screenshots of fliipkart and send email 
	Given browser opened with flipkart 
	And when taken screenshots with required actions 
	When open new window and open gmail 
	Then compose email and send screenshots 
	And close browser 
	
Scenario: to select gaming laptop in flipkart ans send email 
	Given browser opened with flipkart1 
	And choose gaming laptop and add to cart 
	When delete from cart and open gmail 
	Then compose mail and send ScreenShots
	
Scenario: to fail and see in extent report 
	Given flipkart opened
	When validate title
	Then close driver