
Feature: As a registered user, I would like to be able to see the categories and products of the Menu menu on the home page

  Background: Sign In
    * User makes driver adjustments
    * The user logs in by entering their credentials, including "email" and "password".


  Scenario: Visibility and clickability of the Men category window and its subcategories on the homepage
    * The "Men" category window should be visible
    * The Men "Men Clothing" should be visible and clickable
    * Driver turns off


  Scenario: Adding to Cart under the Men category
    * User clicks the button with description "Men"
    * User clicks the button with itemName "Adidas 3-Stripes Cushioned Crew Socks" and "0 (0  Reviews)" and "$15.00" and "Black"
    * User swipes to screen coordinates 671, 2587, 700, 970
    * User clicks the button with description "Add To Cart"
    * "Product added to cart" message should be visible
    * The "Product Details" should be visible
    * Driver turns off


  Scenario: Adding to Wishlist under the Men category
    * User clicks the button with description "Men"
    * User clicks the button with itemName "Adidas 3-Stripes Cushioned Crew Socks" and "0 (0  Reviews)" and "$15.00" and "Black"
    * User swipes to screen coordinates 671, 2587, 700, 970
    * User clicks the button with description "Favorite"
    * "Added to Wishlist" message should be visible
    * The "Product Details" should be visible
    * Driver turns off


  Scenario: Activeness of the filter icons
    * User clicks the button with description "Men"
    * The "Sort By" under the Men category should be clickable
    * Driver turns off

