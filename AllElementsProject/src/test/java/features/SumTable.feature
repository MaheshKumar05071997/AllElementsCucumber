Feature:  To verify the Auto country suggestion Functionality

Background: 
Given User lands on main website

@SumTable
Scenario: User counts the sum of numbers in the table
Given user is able to see the values present in the table
When user is able to add all the values present in the table
Then the sum of all the values are same as displayed on the UI
And user closes browser