$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebTestAutomation.feature");
formatter.feature({
  "line": 1,
  "name": "Automate the practice website",
  "description": "Automate the test flows in the given practice website",
  "id": "automate-the-practice-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Order T-Shirt and verify order history",
  "description": "",
  "id": "automate-the-practice-website;order-t-shirt-and-verify-order-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user signin with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on TShirts category",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user adds the Tshirt \"Faded Short Sleeve T-shirts\" to cart",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the \"Product successfully added to your shopping cart\" overlay popup should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the user clicks on Proceed to checkout in the overlay popup",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the \"Faded Short Sleeve T-shirts\" should be displayed in the product table in shipping cart summary",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "the user clicks on Proceed to checkout button in summary section",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user checks the checkbox to use delivery address as billing address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user clicks on Proceed to checkout button in address section",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user checks I agree check box in shipping section",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "the user clicks on Proceed to checkout button in shipping section",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user completes payment with Pay by bank wire option",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user verifies the success message and note down the reference",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the user clicks on Back to orders button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user should be able to locate the order in the order history table",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the user signout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeSite_StepDefs.user_is_in_the_home_page()"
});
formatter.result({
  "duration": 6723293500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "PracticeSite_StepDefs.user_signin_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 2890598800,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.user_should_be_logged_in()"
});
formatter.result({
  "duration": 48362900,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_tshirts_category()"
});
formatter.result({
  "duration": 1546901800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 26
    }
  ],
  "location": "PracticeSite_StepDefs.the_user_adds_the_tshirt_something_to_cart(String)"
});
formatter.result({
  "duration": 415924900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product successfully added to your shopping cart",
      "offset": 5
    }
  ],
  "location": "PracticeSite_StepDefs.the_something_overlay_popup_should_be_displayed(String)"
});
formatter.result({
  "duration": 1616138300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_proceed_to_checkout_in_the_overlay_popup()"
});
formatter.result({
  "duration": 1030041500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 5
    }
  ],
  "location": "PracticeSite_StepDefs.the_something_should_be_displayed_in_the_product_table_in_shipping_cart_summary(String)"
});
formatter.result({
  "duration": 63882200,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_proceed_to_checkout_button()"
});
formatter.result({
  "duration": 1574932200,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_checks_the_checkbox_to_use_delivery_address_as_billing_address()"
});
formatter.result({
  "duration": 46542900,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_proceed_to_checkout_button_in_address_section()"
});
formatter.result({
  "duration": 1097278800,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_checks_i_agree_check_box_in_shipping_section()"
});
formatter.result({
  "duration": 77961700,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_proceed_to_checkout_button_in_shipping_section()"
});
formatter.result({
  "duration": 1611849200,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_completes_payment_with_pay_by_bank_wire_option()"
});
formatter.result({
  "duration": 3536891000,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_verifies_the_success_message_and_note_down_the_reference()"
});
formatter.result({
  "duration": 68151400,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_back_to_orders_button()"
});
formatter.result({
  "duration": 4316524200,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_should_be_able_to_locate_the_order_in_the_order_history_table()"
});
formatter.result({
  "duration": 31362400,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_signout_from_the_application()"
});
formatter.result({
  "duration": 7192809400,
  "status": "passed"
});
formatter.after({
  "duration": 650659600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Update firstname in the personal information section in My Account",
  "description": "",
  "id": "automate-the-practice-website;update-firstname-in-the-personal-information-section-in-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user is in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user signin with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "the user clicks on accout",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the user clicks on My Personal Information button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "the user replaces firstname with \"Levin C\" and enters current password",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the user clicks on save button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "the success message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "the account name should be changed to \"Levin C Savarimuthu Devar Joseph\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the user signout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "PracticeSite_StepDefs.user_is_in_the_home_page()"
});
formatter.result({
  "duration": 11818022600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "PracticeSite_StepDefs.user_signin_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 8872863300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.user_should_be_logged_in()"
});
formatter.result({
  "duration": 31813300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_accout()"
});
formatter.result({
  "duration": 658114300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_my_personal_information_button()"
});
formatter.result({
  "duration": 989742600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Levin C",
      "offset": 34
    },
    {
      "val": "password",
      "offset": 62
    }
  ],
  "location": "PracticeSite_StepDefs.the_user_replaces_firstname_with_something_and_enters_current_password(String,String)"
});
formatter.result({
  "duration": 204081800,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_clicks_on_save_button()"
});
formatter.result({
  "duration": 1565643500,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_success_message_should_be_displayed()"
});
formatter.result({
  "duration": 65933200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Levin C Savarimuthu Devar Joseph",
      "offset": 39
    }
  ],
  "location": "PracticeSite_StepDefs.the_account_name_should_be_changed_to_something(String)"
});
formatter.result({
  "duration": 33492300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeSite_StepDefs.the_user_signout_from_the_application()"
});
formatter.result({
  "duration": 2811325800,
  "status": "passed"
});
formatter.after({
  "duration": 652915600,
  "status": "passed"
});
});