Feature: new sign up functionality within automation exercise web app
  Scenario: normal sign up workflow
    Given user is on main page of auto exercise
    When user clicks on sign up button on main page
    Then user enters name and email as follows 'Test' and 'fgfdf@td.com' and clicks sign up button
    And user checks Mr radio button enters name as 'John Snow' and password as 'ASDAS@!#!@'
    Then user selects day as '12' month as 'September' and year as '1989'
    And user enters firstname as 'Kobe' and lastname as 'Abdy' and address as '1 N Dearborn ave'
    Then user selects country as 'United States' and state as 'Illinois' city as 'Elgin'
    Then user enters zipcode as '60601' and enters mobile as '23234234324' and clicks create account button

