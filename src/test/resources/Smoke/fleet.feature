Feature: User be able to access Vehicle Odometer Page


Background:

    Given User is on the Fleet login Page
    When user enters "username" and "password"
    Then User sees and click Fleet Page
    Then User sees Vehicle Odometer button and clicks it
    Then User reaches Vehicle Odometers Grid Page

  @fleety
  Scenario: to create Vehicle Odometer or cancel it

    Given User is on the Vehicle Odometer Grid Page
    When User clicks Create Vehicle Odometer button
    Then user writes information about Vehicle Odometer
    And  User save information
    Then User delete all information he wrote

 @fleet
  Scenario: to search Grid setting and check it

      When User clicks Grid settings
      Then User sees Grid setting table and select what they want to see


