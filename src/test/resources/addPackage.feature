Feature: Test


  Scenario: Add The Package
    Given User goes to the TOD page
    Then It is checked that the homepage is open
    When User clicks to the buy button
    Then It is checked that the buy page is open
    And Super League package is checked
    And Price is right
    When User clicks to the buy now button
    And Shopping cart page is checked
