
Feature: [US_011] As a registered user, I would like to be able to create a favorites list on the site.

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: [US_011 => TC01] Test to select favorite products and add to wishlist.
    And Click on your profile icon.
    And Click on your sign in icon.
    When Click on the use email instead link.
    And Enter a valid user email in the email box.
    When Enter a valid user password in the password box.
    And Click the sign in button.
    And Click to add two products on the homepage to your wishlist.
    Then Added to wishlist verify warning text.
    And Driver turns off

  Scenario: [US_011 => TC02] The product should also be able to be added to favorites from the product page.
    And Click on your profile icon.
    And Click on your sign in icon.
    When Click on the use email instead link.
    And Enter a valid user email in the email box.
    When Enter a valid user password in the password box.
    And Click the sign in button.
    And Click on the relevant product.
    When While on the product page, remove the product from your favorites by scrolling down.
    Then verify the warning message that the product has been removed from the wishlist.
    And add the product back to wishlist.
    Then Added to wishlist verify warning text.
    And Driver turns off

