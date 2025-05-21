Feature: US_23 As a user, I want to create a favorite list with the products I like without registering.

  Background: User opens the app
    Given User makes driver adjustments

  Scenario:  Verify Favorite Icon Visibility on Product List

    Then User locates and verifies the favorite icon on a product containing name "Flower Print Foil T-shirt".
    And Driver turns off

  Scenario:  Verify that clicking on favorite icon navigates the user to login page

    When User clicks the wishlist icon with itemName "Flower Print Foil T-shirt"
    Then User verifies that clicking the favourite icon navigates to Sign In page
    And Driver turns off