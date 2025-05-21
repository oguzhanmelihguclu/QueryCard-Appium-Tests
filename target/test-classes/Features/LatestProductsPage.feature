
Feature:  As a user, I would like to have a page where I can follow the latest products on the site where I shop.


    #Background: User opens the app

    #Given User open the application
   # And User logs into the application with "TST-001UserEmail" and "applicationPassword" password

  @A
  Scenario: Test that the “Most popular” menu is visible on the home page navBar

    Given User open the application
    And User logs into the application with "email" and "password" password
    Then Verify that the “Most Popular” menu heading appears in the home page navigation bar
    And User shuts down the system


    Scenario: To test that the “See All” icon on the most popular page is viewable and clickable

      Given User open the application
      And User logs into the application with "email" and "password" password
      Then Confirms that the “See All” icon is visible
      And  Confirms that the “See All” icon is clickable
      Then Confirms that the routing is done



   Scenario:  Test that the back button can redirect to the homepage

     Given User open the application
     And User logs into the application with "email" and "password" password
     And  Confirms that the “See All” icon is clickable
     Then Confirms that products are listed
     And Clicks the back button
     And Confirms redirection to homepage
     And User shuts down the system
