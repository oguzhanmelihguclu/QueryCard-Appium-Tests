Feature: US_003 Browsing and Adding Products to Cart without Registration


  Background: User opens the app
    * User makes driver adjustments
    # Kullanıcı uygulamayı açar ve gerekli ayarlamaları yapar

  Scenario: Positive - Products and product features should be visible on the homepage
    Then Verifies that products are visible on the homepage
    # Ürünlerin ana sayfada göründüğünü doğrular
    When Verifies that product features such as size, color, and quantity are visible for selection
    # Ürün özelliklerinin (beden, renk, miktar) seçilebilir olduğunu doğrular
    And Driver turns off
    # Driver kapatılır

  Scenario: Positive - User can select size, color, and quantity of a product
    Given User clicks on the product with description "Flower Print T-shirt"
    # "Flower Print T-shirt" ürününe tıklar
    When Verifies that size options are visible and selectable
    # Beden seçeneklerinin göründüğünü ve seçilebilir olduğunu doğrular
    And User selects size "M"
    # "M" bedenini seçer
    Then Verifies that quantity options are visible and selectable
    # Miktar seçeneklerinin göründüğünü ve seçilebilir olduğunu doğrular
    When User selects quantity "2"
    # 2 miktarını seçer
    Then Verifies that the "Add to Cart" button is visible and active
    # "Add to Cart" butonunun görünür ve aktif olduğunu doğrular
    When User clicks on the "Add to Cart" button
    # "Add to Cart" butonuna tıklar
    Then Verifies that the item is added to the cart
    # Ürünün sepete eklendiğini doğrular
    And Driver turns off
    # Driver kapatılır

  Scenario: Negative - Product features are not visible on the homepage
    Then Verifies that products are visible on the homepage
    # Ürünlerin ana sayfada göründüğünü doğrular
    When Verifies that product features such as size, color, and quantity are NOT visible
    # Ürün özelliklerinin (beden, renk, miktar) görünmediğini doğrular
    And Driver turns off
    # Driver kapatılır




