Feature: Shipping Information Page

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "phoneTextBox" and sendKeys "223344556"
    * User clicks the button "signInLoginButton"

  @1
  Scenario: Delivery and Pick Up buttons are visible and enabled
    * User clickss the "Men" button
    * From the opened menu, user selects "Adidas 3-Stripes Cushioned"
    * User selects the color "Black"
    * User clicks the Add to Cart button
    * User clicks the cart icon
    * From the opened page, user clicks the "Proceed to Checkout" button
    * User sees and clicks the "Delivery" button
    * User sees and clicks the Pick Up button
    * Driver turns off


  @2
  Scenario: User updates address information
    * User clickss the "Men" button
    * From the opened menu, user selects "Adidas 3-Stripes Cushioned"
    * User selects the color "Black"
    * User clicks the Add to Cart button
    * User clicks the cart icon
    * From the opened page, user clicks the "Proceed to Checkout" button
    * User sees and clicks the "Delivery" button
    * User sees the "Shipping Address" section
    * User sees and clicks the Edit button
    * In the opened form, user updates the city information
    * User sees the message Address updated successfully
    * Driver turns off

  @3
  Scenario: Order Summary is displayed under Order Summary title
    * User clickss the "Men" button
    * From the opened menu, user selects "Adidas 3-Stripes Cushioned"
    * User selects the color "Black"
    * User clicks the Add to Cart button
    * User clicks the cart icon
    * From the opened page, user clicks the "Proceed to Checkout" button
    * User clicks the Pick Up button
    * User verifies the "Order Summary" title is visible
    * User verifies the order price is displayed in the "Total" section
    * Driver turns off

  @4
  Scenario: Save & Pay button is visible and enabled
    * User clickss the "Men" button
    * From the opened menu, user selects "Adidas 3-Stripes Cushioned"
    * User selects the color "Black"
    * User clicks the Add to Cart button
    * User clicks the cart icon
    * From the opened page, user clicks the "Process to Checkout" button
    * User sees and clicks the Save & Pay button
    * User verifies they are redirected to the payment page
    * Driver turns off

