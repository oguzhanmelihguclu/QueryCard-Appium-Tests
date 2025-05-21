Feature: US_003 Browsing and Adding Products to Cart without Registration


  Background: User opens the app
    * User makes driver adjustments


  Scenario: Positive - Products and product features should be visible on the homepage
    Then Verifies that products are visible on the homepage

    When Verifies that product features such as size, color, and quantity are visible for selection

    And Driver turns off


  Scenario: Positive - User can select size, color, and quantity of a product
    Given User clicks on the product with description "Flower Print T-shirt"

    When Verifies that size options are visible and selectable

    And User selects size "M"

    Then Verifies that quantity options are visible and selectable

    When User selects quantity "2"

    Then Verifies that the "Add to Cart" button is visible and active

    When User clicks on the "Add to Cart" button

    Then Verifies that the item is added to the cart

    And Driver turns off


  Scenario: Negative - Product features are not visible on the homepage
    Then Verifies that products are visible on the homepage

    When Verifies that product features such as size, color, and quantity are NOT visible

    And Driver turns off





