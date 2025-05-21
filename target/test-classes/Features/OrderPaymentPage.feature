Feature: As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Scenario: Testing the existence of the basket Information page

    Given User open the application
    And User logs into the application with "email" and "password" password
    Then Click on the product to go to the page
    Then He chooses the size of the product he wants
    And Product setepe adds
    And Goes to the cart by clicking on the cart icon
    And Confirms that you are directed to the basket


    Scenario: Testing the existence of the Shipping Information page

      Given User open the application
      And User logs into the application with "email" and "password" password
      Then Click on the product to go to the page
      Then He chooses the size of the product he wants
      And Product setepe adds
      And Goes to the cart by clicking on the cart icon
      And Confirms that you are click to the basket
      And Confirms that there is a shipping Information page


      Scenario: Testing the presence of the save pay button

        Given User open the application
        And User logs into the application with "email" and "password" password
        Then Click on the product to go to the page
        Then He chooses the size of the product he wants
        And Product setepe adds
        And Goes to the cart by clicking on the cart icon
        And Confirms that you are click to the basket
        And  User selects the address
        And  confirms that there is a save pay button


        Scenario: Testing the existence of the Payment Information page

          Given User open the application
          And User logs into the application with "email" and "assword" password
          Then Click on the product to go to the page
          Then He chooses the size of the product he wants
          And Product setepe adds
          And Goes to the cart by clicking on the cart icon
          And Confirms that you are click to the basket
          And  User selects the address
          And Confirms that is click save pay button
          And Verifies the existence of the Payment Information page


          Scenario: To test that the “Confirm Order” button on the Select Payment Method page is functional

            Given User open the application
            And User logs into the application with "email" and "password" password
            Then Click on the product to go to the page
            Then He chooses the size of the product he wants
            And Product setepe adds
            And Goes to the cart by clicking on the cart icon
            And Confirms that you are click to the basket
            And  User selects the address
            And Confirms that is click save pay button
            And Confirm Order button is confirmed



          Scenario: Test that the Confirm Order button redirects to the checkout page

            Given User open the application
            And User logs into the application with "email" and "password" password
            Then Click on the product to go to the page
            Then He chooses the size of the product he wants
            And Product setepe adds
            And Goes to the cart by clicking on the cart icon
            And Confirms that you are click to the basket
            And  User selects the address
            And Confirms that is click save pay button
            Then Clicks on the S
            And Confirm Order button click
            And Confirm that the Confirm button is displayed


  @E2E
  Scenario Outline: To test the input of credit card details

    Given User open the application
    And User logs into the application with "email" and "password" password
    Then Click on the product to go to the page
    Then He chooses the size of the product he wants
    And Product setepe adds
    And Goes to the cart by clicking on the cart icon
    And Confirms that you are click to the basket
    And  User selects the address
    And Confirms that is click save pay button
    Then Clicks on the S
    And Confirm Order button click
    Then Enter valid "<cartNumber>" "<cardDate>" "<cvcCode>" and "<zipCodde>" in card textbox
    And Confirm by clicking on the button

    Examples:
      | cartNumber       | cardDate | cvcCode | zipCodde |
      | 4242424242424242 | 0230     | 522     | 48800    |




   Scenario Outline: To test the visibility and functionality of the order details button on the orders page

     Given User open the application
     And User logs into the application with "email" and "password" password
     Then Click on the product to go to the page
     Then He chooses the size of the product he wants
     And Product setepe adds
     And Goes to the cart by clicking on the cart icon
     And Confirms that you are click to the basket
     And  User selects the address
     And Confirms that is click save pay button
     Then Clicks on the S
     And Confirm Order button click
     Then Enter valid "<cartNumber>" "<cardDate>" "<cvcCode>" and "<zipCodde>" in card textbox
     And Confirm by clicking on the button
     And Clicks on the order details button


     Examples:
       | cartNumber       | cardDate | cvcCode | zipCodde |
       | 4242424242424242 | 0230     | 522     | 48800    |





  Scenario Outline: To test the visibility and functionality of the order details button on the orders page

    Given User open the application
    And User logs into the application with "email" and "password" password
    Then Click on the product to go to the page
    Then He chooses the size of the product he wants
    And Product setepe adds
    And Goes to the cart by clicking on the cart icon
    And Confirms that you are click to the basket
    And  User selects the address
    And Confirms that is click save pay button
    Then Clicks on the S
    And Confirm Order button click
    Then Enter valid "<cartNumber>" "<cardDate>" "<cvcCode>" and "<zipCodde>" in card textbox
    And Confirm by clicking on the button
    And Clicks on the goToShoppingButton button


    Examples:
      | cartNumber       | cardDate | cvcCode | zipCodde |
      | 4242424242424242 | 0230     | 522     | 48800    |











