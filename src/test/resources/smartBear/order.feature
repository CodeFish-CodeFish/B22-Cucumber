Feature: smart bear order functionality
#  Scenario: Positive scenario to check input fields
#    When user is on login page user enters username as 'Tester' and password as 'test'
#    Given user is on main page of smartBear and user clicks on order button
#    When user is on order page user validates title of the order page as 'Web Orders'
#    Then user selects 'ScreenSaver' from the dropdown and enters '100' into quantity input field
#    And user enters their name as 'Thomas Shelby' and street address as 'Pike st'
#    Then user enters city as 'London' state as 'Alabama' and zipcode as '60659'
#    And user checks visa radio button and enters credit card as '434343434343' and expiration as '12/28'
#    Then user clicks on process button


  Scenario Outline: Positive scenario to check input fields
    When user is on login page user enters username as '<username>' and password as '<password>'
    Given user is on main page of smartBear and user clicks on order button
    When user is on order page user validates title of the order page as '<title>'
    Then user selects '<productName>' from the dropdown and enters '<quantity>' into quantity input field
    And user enters their name as '<name>' and street address as '<street>'
    Then user enters city as '<city>' state as '<state>' and zipcode as '<zipcode>'
    And user checks visa radio button and enters credit card as '<creditCard>' and expiration as '<expiration>'
    Then user clicks on process button

    Examples: Test Data for SmartBear Web App
      | username | password | title      | productName | quantity | name          | street      | city    | state      | zipcode | creditCard   | expiration |
      | Tester   | test     | Web Orders | ScreenSaver | 100      | Thomas Shelby | Pike st     | London  | Alabama    | 60659   | 434343434343 | 12/28      |
      | Tester   | test     | Web Orders | FamilyAlbum | 90       | Jackie Chan   | Michigan st | Chicago | Illinois   | 60659   | 434343434343 | 12/28      |
      | Tester   | test     | Web Orders | ScreenSaver | 10       | Bruce Lee     | Dearborn    | Seattle | Washington | 60659   | 434343434343 | 12/28      |
