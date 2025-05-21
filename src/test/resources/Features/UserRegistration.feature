
Feature: [US_007] As a user, I would like to be able to register on the site to take advantage of its functions.

  Background: User opens the app
    Given User makes driver adjustments

  Scenario: [US_007 => TC01] The profile icon should be visible and active at the bottom bar of the home page and SignUp button should be visible and active under the SignUp form.
    Then Verifies that the profile button is visible and active.
    And Click on your profile icon.
    Then Verifies that the sign up button is visible and active.
    And Driver turns off

  Scenario: [US_007 => TC02] The SignUp form must have fields that cannot be left blank (Firstname, Email or Phone, Password) and The email entered for email entry must meet the valid email criteria.
    And Click on your profile icon.
    And Click on your sign up icon.
    And Click the name box and enter any name.
    When Click on the use email instead link.
    And Enter a valid email in the email box.
    When Enter a valid password in the password box.
    And Click the sign up button.
    Then Verify that the message user created successfully is displayed.
    And Driver turns off

  Scenario: [US_007 => TC03] It should be noted that no user was created with an invalid email address.
    And Click on your profile icon.
    And Click on your sign up icon.
    And Click the name box and enter any name.
    When Click on the use email instead link.
    And Enter an invalid email in the Email box.
    When Enter a valid password in the password box.
    And Click the sign up button.
    Then Verify that the sign up button is not active.
    And Driver turns off

  Scenario: [US_007 => TC04] It should be noted that no user was created with an invalid password.
    And Click on your profile icon.
    And Click on your sign up icon.
    And Click the name box and enter any name.
    When Click on the use email instead link.
    And Enter a valid email in the email box.
    When Enter a invalid password in the password box.
    And Click the sign up button.
    Then Verify the error message above due to invalid password entry.
    And Driver turns off

