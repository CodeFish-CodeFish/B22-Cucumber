Feature: Contact us form

  Scenario: Positive test for contact us form functionality
    Given user is navigated to the webpage
    Then user enters name and email
    And user enters subject and message
    Then user uploads a file and clicks on submit button and accepts js alert


  Scenario: Get text scenario from contact us page
    Given user is navigated to the webpage
    When user is on contact us page user validates contact us header
    Then user validates get in touch text
    And user validates feedback for us text


