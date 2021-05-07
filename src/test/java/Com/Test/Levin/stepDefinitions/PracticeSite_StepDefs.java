package Com.Test.Levin.stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Test.Levin.pageObjects.HomePage;
import Com.Test.Levin.pageObjects.MyAccountPage;
import Com.Test.Levin.pageObjects.OrderHistoryPage;
import Com.Test.Levin.pageObjects.ShoppingCartPage;
import Com.Test.Levin.pageObjects.SignInPage;
import Com.Test.Levin.supportLibraries.Helper;
import Com.Test.Levin.supportLibraries.Settings;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeSite_StepDefs extends Helper {

	
	static Logger log = Logger.getLogger(PracticeSite_StepDefs.class);
	static Properties properties = Settings.getInstance();
	WebDriver driver;
	
	
	@Given("^user is in the home page$")
    public void user_is_in_the_home_page() throws Throwable {
		driver = launchApp(properties.getProperty("url"));
    }

    @When("^user signin with (.*) and (.*)$")
    public void user_signin_with_username_and_password(String username, String password) throws Throwable {
    	PageFactory.initElements(driver, SignInPage.class);
    	PageFactory.initElements(driver, SignInPage.Authentication.class);
    	SignInPage.SignIn_Link.click();
    	SignInPage.Authentication.Email_TxtBox.sendKeys(properties.getProperty(username));
    	SignInPage.Authentication.Password_TxtBox.sendKeys(properties.getProperty(password));
    	scrollToElementAndClick(driver, SignInPage.Authentication.SignIn_Btn);
    }
    
    @Then("^user should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
    	PageFactory.initElements(driver, HomePage.class);
    	waitUntilElementVisible(driver, HomePage.Account_link, 5);
        Assert.assertTrue(IsElementExists(HomePage.Account_link));
    }

    @And("^the user clicks on TShirts category$")
    public void the_user_clicks_on_tshirts_category() throws Throwable {
    	HomePage.T_Shirts_Category_link.click();
    }
    
    @When("^the user adds the Tshirt \"([^\"]*)\" to cart$")
    public void the_user_adds_the_tshirt_something_to_cart(String tShirt_Name) throws Throwable {
    	PageFactory.initElements(driver, HomePage.class);
    	PageFactory.initElements(driver, HomePage.TShirts.class);
    	
    	waitUntilElementVisible(driver, HomePage.TShirts.TShirt_Catg_Title, 5);
    	waitUntilElementVisible(driver, HomePage.TShirts.Product_List, 5);
    	
    	scrollToElement(driver, HomePage.TShirts.Product_List);
    	
    	int i = 0;
    	for(WebElement name: HomePage.TShirts.TShirt_Names) {
    		i++;
    		if(name.getText().equals(tShirt_Name)) {
    			moveFocusToElement(driver, name);
    			break;
    		}
    	}
    	
    	WebElement inStock = locateElement(driver, By.xpath(HomePage.TShirts.InStock.replace("?", String.valueOf(i))));
    	WebElement add_To_Card_Btn = locateElement(driver, By.xpath(HomePage.TShirts.Add_To_Cart_btn_xpath.replace("?", String.valueOf(i))));
    	
    	boolean addedToCart = false;
    	
    	if(IsElementExists(inStock)) {
    		moveFocusToElement(driver, add_To_Card_Btn);
    		add_To_Card_Btn.click();
    		addedToCart = true;
    	} else if(i == 0) {
    		Assert.assertTrue(false, "No T-Shirts available to purchase!");
    	}else {
    		Assert.assertTrue(false, tShirt_Name+" is not in stock");
    	}
    	
    	Assert.assertTrue(addedToCart, "Unable to add the T-Shirt to cart!");
    }
    

    @Then("^the \"([^\"]*)\" overlay popup should be displayed$")
    public void the_something_overlay_popup_should_be_displayed(String successMessage) throws Throwable {
    	PageFactory.initElements(driver, HomePage.class);
    	PageFactory.initElements(driver, HomePage.ProductAddedToCart.class);
    	
    	waitUntilElementVisible(driver, HomePage.ProductAddedToCart.SuccessMessage, 5);
    	Assert.assertTrue(HomePage.ProductAddedToCart.SuccessMessage.getText().equals(successMessage), 
    			"The success message is not as expected. Actual message displayed : "
    	+HomePage.ProductAddedToCart.SuccessMessage.getText());
    }
    
    @And("^the user clicks on Proceed to checkout in the overlay popup$")
    public void the_user_clicks_on_proceed_to_checkout_in_the_overlay_popup() throws Throwable {
    	HomePage.ProductAddedToCart.Proceed_to_checkout_Btn.click();
    }
    
    @Then("^the \"([^\"]*)\" should be displayed in the product table in shipping cart summary$")
    public void the_something_should_be_displayed_in_the_product_table_in_shipping_cart_summary(String tShirtName) throws Throwable {
    	PageFactory.initElements(driver, ShoppingCartPage.class);
    	PageFactory.initElements(driver, ShoppingCartPage.Summary.class);
    	
    	waitUntilElementVisible(driver,  ShoppingCartPage.Summary.Summary_Step_Title, 5);
    	
    	Assert.assertTrue(ShoppingCartPage.Summary.First_Product_Name.getText().equals(tShirtName), 
    			"The actual T-shirt name displayed in summary is: "+ShoppingCartPage.Summary.First_Product_Name.getText()
    			+" Excpected name: "+tShirtName);
    	
    }
    
    @And("^the user clicks on Proceed to checkout button in summary section$")
    public void the_user_clicks_on_proceed_to_checkout_button() throws Throwable {
    	scrollToElementAndClick(driver, ShoppingCartPage.Summary.Proceed_To_Checkout_Btn);
    }
    
    @And("^the user checks the checkbox to use delivery address as billing address$")
    public void the_user_checks_the_checkbox_to_use_delivery_address_as_billing_address() throws Throwable {
    	PageFactory.initElements(driver, ShoppingCartPage.class);
    	PageFactory.initElements(driver, ShoppingCartPage.Address.class);
    	
    	if(!ShoppingCartPage.Address.Use_deliveryAddress_as_billingAddress_ChkBox.isSelected()) {
    		ShoppingCartPage.Address.Use_deliveryAddress_as_billingAddress_ChkBox.click();
    	}
    	
    }
    
    @And("^the user clicks on Proceed to checkout button in address section$")
    public void the_user_clicks_on_proceed_to_checkout_button_in_address_section() throws Throwable {
    	scrollToElementAndClick(driver, ShoppingCartPage.Address.Proceed_To_Checkout_Btn);
    }

    @And("^the user checks I agree check box in shipping section$")
    public void the_user_checks_i_agree_check_box_in_shipping_section() throws Throwable {
    	PageFactory.initElements(driver, ShoppingCartPage.class);
    	PageFactory.initElements(driver, ShoppingCartPage.Shipping.class);
    	scrollToElementAndClick(driver, ShoppingCartPage.Shipping.I_Agree_ChkBox);
    }
    
    @And("^the user clicks on Proceed to checkout button in shipping section$")
    public void the_user_clicks_on_proceed_to_checkout_button_in_shipping_section() throws Throwable {
    	scrollToElementAndClick(driver, ShoppingCartPage.Shipping.Proceed_To_Checkout_Btn);
    }
    
    @When("^the user completes payment with Pay by bank wire option$")
    public void the_user_completes_payment_with_pay_by_bank_wire_option() throws Throwable {
    	PageFactory.initElements(driver, ShoppingCartPage.class);
    	PageFactory.initElements(driver, ShoppingCartPage.Payment.class);
    	
    	scrollToElementAndClick(driver, ShoppingCartPage.Payment.Pay_By_BankWire_link);
    	 waitUntilElementVisible(driver, ShoppingCartPage.Payment.PaymentType_Header, 5);
    	 Assert.assertTrue(IsElementExists(ShoppingCartPage.Payment.PaymentType_Header), "Selected Payment Type 'Bank-wire payment' is not displayed");
    	 
    	 scrollToElementAndClick(driver, ShoppingCartPage.Payment.I_confirm_my_order_Btn);
    	
    }
    
    private static String orderReference = "";
    
    @Then("^the user verifies the success message and note down the reference$")
    public void the_user_verifies_the_success_message_and_note_down_the_reference() throws Throwable {
    	
    	waitUntilElementVisible(driver, ShoppingCartPage.Payment.PaymentConfirmation_Message, 5);
    	Assert.assertTrue(IsElementExists(ShoppingCartPage.Payment.PaymentConfirmation_Message), "Success message, 'Your order on My Store is complete' is not displayed");
    	orderReference = StringUtils.substringAfter(ShoppingCartPage.Payment.Order_Reference.getText(), "reference ").split(" ")[0];
    	 
    }

    @When("^the user clicks on Back to orders button$")
    public void the_user_clicks_on_back_to_orders_button() throws Throwable {
    	scrollToElementAndClick(driver, ShoppingCartPage.Payment.Back_to_orders_link);
    }

    
    @Then("^the user should be able to locate the order in the order history table$")
    public void the_user_should_be_able_to_locate_the_order_in_the_order_history_table() throws Throwable {
    	PageFactory.initElements(driver, OrderHistoryPage.class);
    	
    	boolean orderFound= false;
    	
    	for(WebElement order : OrderHistoryPage.OrderReferences) {
    		if(order.getText().equals(orderReference)) {
    			orderFound = true;
    			break;
    		}
    	}
    	Assert.assertTrue(orderFound, "The order "+orderReference+" is not available in the order history table!");
    }

    @And("^the user signout from the application$")
    public void the_user_signout_from_the_application() throws Throwable {
    	PageFactory.initElements(driver, HomePage.class);
    	HomePage.SignOut_link.click();
    }
    
    @When("^the user clicks on accout$")
    public void the_user_clicks_on_accout() throws Throwable {
    	PageFactory.initElements(driver, HomePage.class);
    	HomePage.Account_link.click();
    }

    @Then("^the user clicks on My Personal Information button$")
    public void the_user_clicks_on_my_personal_information_button() throws Throwable {
    	PageFactory.initElements(driver, MyAccountPage.class);
    	MyAccountPage.My_Personal_Information_Btn.click();
    }


    @And("^the user replaces firstname with \"([^\"]*)\" and enters current (.*)$")
    public void the_user_replaces_firstname_with_something_and_enters_current_password(String firstName, String password) throws Throwable {
    	PageFactory.initElements(driver, MyAccountPage.class);
    	PageFactory.initElements(driver, MyAccountPage.Your_Personal_Information.class);
    	
    	MyAccountPage.Your_Personal_Information.Firstname_TxtBox.clear();
    	MyAccountPage.Your_Personal_Information.Firstname_TxtBox.sendKeys(firstName);
    	MyAccountPage.Your_Personal_Information.CurrentPassword_TxtBox.sendKeys(properties.getProperty(password));
    	
    }
    
    @When("^the user clicks on save button$")
    public void the_user_clicks_on_save_button() throws Throwable {
    	MyAccountPage.Your_Personal_Information.Save_btn.click();
    }
    
    @Then("^the success message should be displayed$")
    public void the_success_message_should_be_displayed() throws Throwable {
    	waitUntilElementVisible(driver, MyAccountPage.Your_Personal_Information.Success_Message, 5);
    	Assert.assertTrue(MyAccountPage.Your_Personal_Information.Success_Message.getText()
    			.equals(MyAccountPage.Your_Personal_Information.successMessage_ExpectedTxt), 
    			"The expected success message is not displayed. Actual message : "
    			+ MyAccountPage.Your_Personal_Information.Success_Message.getText()
    			+" Expected message : "+MyAccountPage.Your_Personal_Information.successMessage_ExpectedTxt);
    }


    @And("^the account name should be changed to \"([^\"]*)\"$")
    public void the_account_name_should_be_changed_to_something(String accountName) throws Throwable {
    	Assert.assertTrue(HomePage.Account_link.getText().equals(accountName), 
    			"The account name displayed is : "+HomePage.Account_link.getText()
    			+"Expected name: "+accountName);
    }
    
    @After
    public void tearDown() {
    	driver.quit();
    }
	
}
