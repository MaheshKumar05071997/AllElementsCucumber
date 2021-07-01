Feature:  To verify the Radio Button Functionality

Background: 
Given User lands on main website
#And user lands on Practice page

@Radio
Scenario: To verify the Radio Button functionality
Given user clicks on "Radio1" button
Then "Radio1" button is selected
And user closes browser