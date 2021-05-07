package Com.Test.Levin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage {
	
	public static class Summary{
		
		@FindBy(how=How.CSS, using="li.step_current.first")
		public static WebElement Summary_Step_Title;
		
		@FindBy(how=How.CSS, using="table#cart_summary>tbody>tr:nth-child(1)>td>p.product-name")
		public static WebElement First_Product_Name;
		
		@FindBy(how=How.CSS, using="span#total_price")
		public static WebElement Total_Price;
		
		@FindBy(how=How.CSS, using="p>a[title='Proceed to checkout']")
		public static WebElement Proceed_To_Checkout_Btn;
		
	}

	public static class Address{
		
		@FindBy(how=How.CSS, using="input#addressesAreEquals")
		public static WebElement Use_deliveryAddress_as_billingAddress_ChkBox;
		
		@FindBy(how=How.CSS, using="button[name='processAddress']")
		public static WebElement Proceed_To_Checkout_Btn;
			
	}
	
	public static class Shipping{
		
		@FindBy(how=How.CSS, using="input#cgv")
		public static WebElement I_Agree_ChkBox;
		
		@FindBy(how=How.CSS, using="button[name='processCarrier']")
		public static WebElement Proceed_To_Checkout_Btn;
		
	}
	
	public static class Payment{
		
		@FindBy(how=How.CSS, using="a.bankwire")
		public static WebElement Pay_By_BankWire_link;
		
		@FindBy(how=How.XPATH, using="//h3[contains(text(),'Bank-wire payment.')]")
		public static WebElement PaymentType_Header;
		
		@FindBy(how=How.CSS, using="p#cart_navigation>button")
		public static WebElement I_confirm_my_order_Btn;
		
		@FindBy(how=How.XPATH, using="//p[@class='cheque-indent']/strong[contains(text(),'Your order on My Store is complete.')]")
		public static WebElement PaymentConfirmation_Message;
		
		@FindBy(how=How.CSS, using="div.box")
		public static WebElement Order_Reference;
		
		@FindBy(how=How.CSS, using="a[title='Back to orders']")
		public static WebElement Back_to_orders_link;
		
	}

}
