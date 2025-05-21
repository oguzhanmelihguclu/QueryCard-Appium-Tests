@test
Feature: As a registered user, I would like to have a page on the site where I can manage my address information

  Background: Sign In
    * User makes driver adjustments
    * The user logs in by entering their credentials, including "email" and "password".


  Scenario: Visibility and clickability of the Address menu in the sidebar
    * User clicks the button with description "Profile"
    * The "Address" menu should be visible and clickable in the sidebar
    * Driver turns off


  Scenario: Visibility and clickability of the Add New Address button
    * User clicks the button with description "Profile"
    * User clicks the button with description "Address"
    * The "Add New Address" button should be visible and clickable
    * Driver turns off


  Scenario: Adding a new address
    * User clicks the button with description "Profile"
    * User clicks the button with description "Address"
    * User clicks the button with description "Add New Address"
    * User fills in all required address fields
    * User clicks the button with description "Add Address"
    * The new address should be displayed in the address list
    * Driver turns off


  Scenario: Viewing registered addresses on the Address page
    * User clicks the button with description "Profile"
    * User clicks the button with description "Address"
    * Registered addresses should be displayed on the page
    * Driver turns off


  Scenario: Editing a registered address on the Address page
    * User clicks the button with description "Profile"
    * User clicks the button with description "Address"
    * User selects a registered address to edit
    * User clicks the button with description "Update Address"
    * "Address Updated Successfuly" message should be visible
    * Driver turns off


    Scenario: Deleting a registered address on the Address page
      * User clicks the button with description "Profile"
      * User clicks the button with description "Address"
      * User selects a registered address to delete
      * User clicks the button with description "Delete"
      * "Address Deleted Successfuly" message should be visible
      * Driver turns off



