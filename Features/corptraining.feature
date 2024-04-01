Feature: Edureka Corporate Training Page

Scenario: On the Corporate Training Page Clicking on Connect With Us button(+ve test case)
Given I am Edureka Home Page
When I click on Corporate Training link
And I click on Connect with us button
And I enter name "K Thanmayee"
And I enter company name "Qwerty"
And I enter Training Need "For Myself"
And I enter EmailId "thanmayee@gmail.com"
And I enter Phone number "3773549802"
And I click on Submit
Then it is submitted successfully

Scenario: On the Corporate Training Page Clicking on Connect With Us button(-ve test case)
Given I am Edureka Home Page
When I click on Corporate Training link
And I click on Connect with us button
And I enter name "Harini"
And I enter Training Need "For Myself"
And I enter EmailId "harini@gmail.com"
And I enter Phone number "2581087344"
And I click on Submit
Then it is submitted successfully


Scenario: On the Corporate Training Page Clicking on Cloud computing and clicking on a topic
Given I am Edureka Home Page
When I click on Corporate Training link and scroll down
And I click on Cloud Computing
And I click on Microservices Certification Training Course
Then I enter into the submitform block

@SanityTest
Scenario: On the Corporate Training Page Clicking on Mobile Development and clicking on a topic
Given I am Edureka Home Page
When I click on Corporate Training link 
And I scroll to the bottom
And I click on Scroll Up
Then I will scroll to top of the page

Scenario Outline: On the Corporate Training Page clicking on download full course 
Given I am Edureka Home Page
When I click on Corporate Training link 
And I scroll down and click on Download Full Course List
And I enter name <name>
And I enter company name <companyname>
And I enter Training Need <trainingneed>
And I enter EmailId <emailid>
And I enter Phone number <phnnum>
And I click on Download Full Course List
Then it is submitted successfully

Examples:
| name | companyname | trainingneed | emailid | phnnum |
| "Dinesh Karthik" | "Zink" | "For Corporate" | "dkarthik2017@gmail.com" | "9956238105" |