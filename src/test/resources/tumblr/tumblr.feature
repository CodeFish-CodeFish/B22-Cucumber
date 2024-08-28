@test
Feature: login functionality
Background: navigates to webpage
  Given user is on main page of tumblr

  Scenario Outline: negative scenario for login functionality
    When user clicks on login button from main page
    Then user clicks on continue with email option
    And user enters '<email>' and clicks on next button
    Then user enters '<password>' and clicks on login button
    And user validates '<errorMessage>'

    Examples: test data for tumblr webpage
      | email          | password      | errorMessage                           |
      | test@test.com  | dsafrtew      | Your email or password were incorrect. |

  Scenario: positive scenario for sign up
    Then user click toggle that changes colors
    And user verifies url of the main page