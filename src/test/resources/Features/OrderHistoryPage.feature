Feature: US_18 As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: (Test Case 1) Verify "Order History" Menu Item in Dashboard Sidebar

    When User clicks the button with description "Profile"
    And  The user logs in by entering their credentials, including "email" and "password".
    And User clicks the button with description "Profile"
    Then User verifies that order history link is visible
    And User hits the back link
    And The user gets logged out.
    And Driver turns off

  Scenario: (Test Case 2) Verify Shopping History Viewing Icon on Order History Page

    When User clicks the button with description "Profile"
    And  The user logs in by entering their credentials, including "email" and "password".
    And User clicks the button with description "Profile"
    And User clicks the button with description "Order History"
    Then User verifies that shopping history viewing icon is visible and active on the Order History page.
    And User hits the back link
    And User hits the back link
    And The user gets logged out.
    And Driver turns off

  Scenario: (Test Case 3) Verify Access to Order Invoice from Order History List

    When User clicks the button with description "Profile"
    And  The user logs in by entering their credentials, including "email" and "password".
    And User clicks the button with description "Profile"
    And User clicks the button with description "Order History"
    Then User verifies that shopping history viewing icon is visible and active on the Order History page.
    And User clicks scrolls down to the button with description "Download Receipt"
    And User clicks the button with description "Download Receipt"
    Then User verifies the button with description "Print Invoice" is visible
    And Driver turns off

  Scenario: (Test Case 4) Verify Cancel Order Functionality from Order History List

    When User clicks the button with description "Profile"
    And  The user logs in by entering their credentials, including "email" and "password".
    And User clicks the button with description "Profile"
    And User clicks the button with description "Order History"
    Then User verifies that shopping history viewing icon is visible and active on the Order History page.
    And User clicks scrolls down to the button with description "Cancel Order"
    And User clicks the button with description "Cancel Order"
    And User clicks scrolls up to the button with description "Order Canceled"
    Then User verifies the button with description "Order Canceled" is visible
    And Driver turns off


