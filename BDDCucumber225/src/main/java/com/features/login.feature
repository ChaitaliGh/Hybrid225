Feature: JBK offline application

Scenario: verify login page

Given user should enter URL
Then  user navigate to login page

Scenario: verify loginTest

Given user should enter URL
When user enters valid credentials
Then user should navigate dashboard page