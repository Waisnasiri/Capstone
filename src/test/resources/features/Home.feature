Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @test
  Scenario: Verify Retail page logo
    Then User verify retail page logo is present


  @sidebar
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Sidebarmenu
  Scenario Outline: Verify department sidebar options
    When User click on All section
    When User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @ItemsInCart
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'panthersxy40@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @ItemsInCart2
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'panthersxy40@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | Country        | Full Name   | Phone Number | Address    | apt | City    | state   | Zip Code |
      | American Samoa | Sahil Tanha | (952)8993215 | 6th Street |  62 | Concord | Tutuila |    20203 |
    And User Click on add payment card
    And User Add a credit card or Debit Card for Payment method
      | Card Number      | Name on Card | expirationMonth | expirationYear | Security Code |
      | 2569874123658998 | Sahil        |               4 |           2025 |           255 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  @orderitems
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'panthersxy40@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on itemes
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
