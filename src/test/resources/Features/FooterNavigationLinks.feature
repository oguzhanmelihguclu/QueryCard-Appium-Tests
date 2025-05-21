Feature: US_002 Bottom Bar and Search Functionality


  Background: User opens the app
    * User makes driver adjustments


  Scenario: Positive - Bottom bar links should be visible
    Then Verifies that bottom bar links are visible

    And Driver turns off


  Scenario: Positive - Each bottom bar link navigates to correct page
    Given User clicks on the Home tab and Verifies page title is Home
    When User clicks on the Category tab and Verifies page title is Men
    Then User clicks on the Wishlist tab and Verifies page button is Sign In
    And User clicks on the Profile tab and Verifies page title is My Profile
    Then User clicks on the Cart tab and Verifies page title is My Cart
    And Driver turns off


  Scenario: Positive - Search box is visible and functional
    Given User clicks the search textbox and types "shirt"

    Then Verifies that search results are displayed

    And Driver turns off



  Scenario: Negative - Search with invalid keyword returns no result
    Given User clicks the search textbox and types "asdlkfj1234"

    Then Verifies that "No results found" message is displayed

    And Driver turns off

