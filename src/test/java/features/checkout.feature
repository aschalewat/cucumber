Feature: Checkout

  Scenario: Checkout a banana
    Given the price of Fruit and Price
      | Fruit   | Price |
      | Apple   | 40    |
      | Banana | 30    |
      | Orange  | 20    |
    When I checkout 1 "banana"
    Then the total price should be 40c