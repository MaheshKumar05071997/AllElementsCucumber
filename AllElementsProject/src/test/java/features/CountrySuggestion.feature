Feature:  To verify the Auto country suggestion Functionality

Background: 
Given User lands on main website


@Country
Scenario: To verify the Auto country suggestion Functionality
Given user enters "India" in the text field
Then "India" is selected
And user closes browser