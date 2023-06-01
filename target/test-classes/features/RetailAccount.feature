
@Capstone
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'student235@tekschool.us' and password 'Tek@School7'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'TekSchoolstudentlmp' and Phone '6415834756'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1452369587419423 | TekSchools |               9 |           2026 |          897 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'


  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User selects the card ending with '423'    
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7852369841257854 | TekStudent |              8 |           2026 |          855 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User selects the card ending with '854'
    And User click on remove option of card section
    Then payment details should be removed
 
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName    | phoneNumber | streetAddress    | apt | city   | state   | zipCode |
      | Canada  | Tek Student |  1234567891 | 846 Maple Avenue |   2 | Milton | Ontario |   12208 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user edit address form with below information
      | country | fullName      | phoneNumber | streetAddress       | apt | city | state | zipCode |
      | Norway  | Tek Studentss |  7896541289 | 915 Lawrence Street |   3 | Oslo | Troms |   91258 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
