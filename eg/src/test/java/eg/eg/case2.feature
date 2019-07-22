Feature: TestMeApp
Scenario Outline: Registered user
 Given I want to type the url
 Then Click on Sign in
  And I enter the "<username>" and "<password>"

   Then I click on Login
   Examples:
  |username|password   |
  |lalitha |password123|