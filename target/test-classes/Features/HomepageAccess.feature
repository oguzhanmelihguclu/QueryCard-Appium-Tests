Feature: US_001 Access to homepage-As a user, I want to access the homepage when I open the app.


  Background: User opens the app
    * User makes driver adjustments


  Scenario: Homepage should be accessible when the app is launched (positive scenario)

    Then User Verifies page title logo

    And Driver turns off


