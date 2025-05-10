Feature:  As a user, I want to be able to access detailed information about the product I have selected on the page

  Scenario: Navigation to the Relevant Product Page
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    And    The user clicks on the The North Face Arctic Parka product on the homepage.
    Then   The user verifies that the relevant page has been navigated to.
    And    The user gets logged out.


  Scenario:"Videos" Heading is Visible and Clickable   (FAILED)
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    And    The user clicks on the The North Face Arctic Parka product on the homepage.
    Then   The user verifies that the Videos heading is visible and clickable on the relevant page.
    And    The user gets logged out.


  Scenario: "Product Details" Heading and Product Information
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    And    The user clicks on the The North Face Arctic Parka product on the homepage.
    And    The user clicks on the Details heading.
    Then   The user sees the Product Details heading and the product information.
    And    The user gets logged out.


  Scenario:"Product Reviews" Heading and Reviews   ( FAILED )
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    And    The user clicks on the The North Face Arctic Parka product on the homepage.
    And    The user clicks on the Review heading.
    Then   The user sees the Product Reviews heading and views the reviews underneath it.
    And    The user gets logged out.


  Scenario:"Shipping & Return" Policy  ( FAILED)
    Given  User makes driver adjustments
    And    The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    And    The user clicks on the The North Face Arctic Parka product on the homepage.
    And    The user clicks on the Shipping & Return heading.
    Then   The user sees the Shipping & Return heading and the product's shipping and return policy description.
    And    The user gets logged out.
