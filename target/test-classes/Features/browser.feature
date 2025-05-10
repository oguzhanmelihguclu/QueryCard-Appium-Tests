@browser
Feature: Browser kullanarak test

  Scenario: deneme1
    Given [browser] The user goes to the "QueryCartURL" page.
    And   [browser] The user logs in by entering their credentials, including "emailOguzhan" and "passwordOguzhan".
    Then  [browser] The user sees the Categories heading on the homepage.
    And   [browser] The user gets logged out.
