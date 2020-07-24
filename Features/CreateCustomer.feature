@test1
Feature: Create Customer
  Scenario: Create customer with Valid data
    Given Userlogged into GuruSite
    When User click Newcustomer tab
    When user enters the follwoing details
    * Customer Name
    * Gender
    * Date of Birth
    * Address
    * City
    * State
    * PIN
    * Mobile Number
    * E-mail
    * Password
    When user clicks SubmitButton
    Then New customer will be created