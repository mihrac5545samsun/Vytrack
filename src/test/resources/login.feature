Feature: As a User I should be able to login


  @login
  Scenario Outline: login with different users
    Given User is on the login Page
    When User enter "<username>" "<password>"
    Then User should be able to see "<Fleet Page>"
    Then User sees and click Fleet Page
    Then User sees Vehicle Odometer button and clicks it
    Then User reaches Vehicle Odometers Grid Page

    Examples:

      | username | password    | Fleet Page       |
      | user36   | UserUser123 | FLEET MANAGEMENT |
      | user37   | UserUser123 | FLEET MANAGEMENT |
      | user38   | UserUser123 | FLEET MANAGEMENT |





