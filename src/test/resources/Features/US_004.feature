
Feature: As a user, I want to be able to see the categories under the categories
  heading on the homepage and select the product from the category I want.

@test
  Scenario: The "Categories" Heading Should Be Visible on the Homepage
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    Then   The user sees the Categories heading on the homepage.
    And    The user gets logged out.

  Scenario: The "Men" Link Should Be Visible Under the "Categories" Heading
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    Then   The user sees the Men link under the Categories heading.
    And    The user gets logged out.

  Scenario: The "Toys" Link Should Be Visible Under the "Categories" Heading
    Given User makes driver adjustments
    And   The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    Then  The user sees the Toys link under the Categories heading.
    And   The user gets logged out.

  Scenario: The "Men Boots" Link Should Be Visible Under the "Categories" Heading
    Given User makes driver adjustments
    And   The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    Then  The user sees the Men Boots link under the Categories heading.
    And   The user gets logged out.