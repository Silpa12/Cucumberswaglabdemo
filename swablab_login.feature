@Swablab
Feature: feature to test login functionality

  @Sawblab1
  Scenario:Login the page with valid informations
    Given swablab page is open
    When enter username "<username>" and password "<password>"
    And click on login button
    Then display home page
    And the product list page displays
    When user select the product
    And clicks on add to cart button
    Then cart button displays item added to cart
   
  Examples: 
  |username | password|
  |standard_user|secret_sauce|