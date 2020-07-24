@test
Feature: Edit Customer
  Scenario: Verify Edit Customer Data
    Given Userlogged into GuruSite
    When User clicks EditCustomer Tab
    Then Window of EditCustomer pop-up on screen
    When User enteres valid customer id details
    When User clicks submit
    Then Edit Customer details displays on screen
    When User change City Details
    And Usersubmits the data
    Then Editcustomer details succesful