Feature: ajax input forms in Lambda webpage

  Scenario: validate input forms
    Given user is on main page of lambda and clicks on ajax submit form link
    When user enters name and message as follows
      | name    | Kobe                       |
      | message | my message to your manager |
    Then user clicks on submit button
    And user validates prompted message as follows
      | expectedMessage | Ajax Request is Processing! |
    Then user validates title of this web page as follows
      | expectedTitle | Selenium Grid Online |