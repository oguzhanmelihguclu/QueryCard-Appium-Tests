Feature: As a user, I want to be able to see the popular brands of the site on the homepage

  Scenario: "Most Popular" Heading Should Be Visible on the Homepage
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user sees the Most Popular heading on the homepage.
    And    The user gets logged out.


  Scenario: "Flower Print Fail T-shirt" Link Should Be Visible Under the "Most Popular" Heading
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user sees the Flower Print Fail T-shirt link under the Most Popular heading.
    And    The user gets logged out.

  Scenario: "Adidas Ultraboost 21 Sneakers" Link Should Be Visible Under the "Most Popular" Heading
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user sees the Adidas Ultraboost 21 Sneakers link under the Most Popular heading.
    And    The user gets logged out.

  Scenario: Price of "The North Face Arctic Parka" Should Be Visible
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user verifies that the price of the The North Face Arctic Parka product is visible.
    And    The user gets logged out.


  Scenario: Reviews Section of "The North Face Arctic Parka" Should Be Visible
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user verifies that the reviews section of the The North Face Arctic Parka product is visible.
    And    The user gets logged out.

  Scenario: Star Rating Section of "The North Face Arctic Parka" Should Be Visible

    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user verifies that the star rating section of the The North Face Arctic Parka product is visible.
    And    The user gets logged out.

  Scenario: Like Section Above "The North Face Arctic Parka" Should Be Visible
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "email" and "password".
    Then   The user verifies that the like section above the The North Face Arctic Parka product is visible.
    And    The user gets logged out.