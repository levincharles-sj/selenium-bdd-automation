Feature: Automate the practice website
  Automate the test flows in the given practice website

  @Demo
  Scenario: Order T-Shirt and verify order history
    Given user is in the home page
    When user signin with username and password
    Then user should be logged in
    And the user clicks on TShirts category
    When the user adds the Tshirt "Faded Short Sleeve T-shirts" to cart
    Then the "Product successfully added to your shopping cart" overlay popup should be displayed
    And the user clicks on Proceed to checkout in the overlay popup
    Then the "Faded Short Sleeve T-shirts" should be displayed in the product table in shipping cart summary
    And the user clicks on Proceed to checkout button in summary section
    And the user checks the checkbox to use delivery address as billing address
    And the user clicks on Proceed to checkout button in address section
    And the user checks I agree check box in shipping section
    And the user clicks on Proceed to checkout button in shipping section
    When the user completes payment with Pay by bank wire option
    Then the user verifies the success message and note down the reference
    When the user clicks on Back to orders button
    Then the user should be able to locate the order in the order history table
    And the user signout from the application
 
  @Demo
  Scenario: Update firstname in the personal information section in My Account 
    Given user is in the home page
    When user signin with username and password
    Then user should be logged in
    When the user clicks on accout
    Then the user clicks on My Personal Information button
    And the user replaces firstname with "Levin C" and enters current password
    When the user clicks on save button
    Then the success message should be displayed
    And the account name should be changed to "Levin C Savarimuthu Devar Joseph"
    And the user signout from the application
    