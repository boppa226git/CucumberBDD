@functional
Feature: Login In order to perform successful login

  Scenario Outline: In order to verify login to facebook
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered the username "<username>"
    And user entered the password   "<password>"
    And user select the age category
    |Age |
    |below 18|
    |above 18|

    And user select id and password
      |id      |password|
      |100     |pass123 |
      |101     |pass456 |
    Then user should be successfully logged in

    Examples:
      |username  |password  |
      |valid     |valid     |
      |invalid   |invalid   |
