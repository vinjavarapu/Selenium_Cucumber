Feature: Delete Customer
  Scenario: Verify Delete Customer
    Given Userlogged into GuruSite
    When User clicks Delete Customer tab
    Then window pop-up with delete customer
    When User enteres the correct Customer ID
    When User clicks Submit button
    Then POp-up message displays with message
    When User accepts the message
    Then User deletes from the site