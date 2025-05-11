
Feature: US_001 Access to homepage-As a user, I want to access the homepage when I open the app.


  Background: User opens the app
    * User makes driver adjustments
    # Kullanıcı uygulamayı açar

  Scenario: Homepage should be accessible when the app is launched (positive scenario)
    # Senaryo: Ana sayfa uygulama açıldığında erişilebilir olmalı (pozitif)
    Then User Verifies page title logo
    # Sayfa başlığının "Home" olduğunu doğrular
    And Driver turns off
    # Driver kapatılır

