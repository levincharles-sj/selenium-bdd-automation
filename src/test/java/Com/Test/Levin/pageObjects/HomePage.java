package Com.Test.Levin.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	
	@FindBy(how=How.CSS, using="div#block_top_menu>ul>li>a[title='T-shirts']")
	public static WebElement T_Shirts_Category_link;
	
	@FindBy(how=How.CSS, using="a.logout")
	public static WebElement SignOut_link;
	
	@FindBy(how=How.CSS, using="a.account")
	public static WebElement Account_link;
	
	public static class TShirts{
		
		@FindBy(how=How.CSS, using="h1")
		public static WebElement TShirt_Catg_Title;
		
		@FindBy(how=How.XPATH, using="//div[@id='center_column']/ul")
		public static WebElement Product_List;
		
		@FindBy(how=How.XPATH, using="//div[@id='center_column']/ul/li//div[@class='right-block']/h5")
		public static List<WebElement> TShirt_Names;
		
		public static String Price_xpath = "//div[@id='center_column']/ul/li[?]//div[@class='right-block']/div/span";
		public static String Add_To_Cart_btn_xpath = "//div[@id='center_column']/ul/li[?]//div[@class='right-block']/div/a[@title='Add to cart']";
		public static String InStock = "//div[@id='center_column']/ul/li[?]//div[@class='right-block']//span[@class='available-now']";
		
	}
	
	public static class ProductAddedToCart{
		
		@FindBy(how=How.CSS, using="div#layer_cart>div>div.layer_cart_product>h2")
		public static WebElement SuccessMessage;
		//Product successfully added to your shopping cart
		
		@FindBy(how=How.CSS, using="a[title='Proceed to checkout']")
		public static WebElement Proceed_to_checkout_Btn;
		
	}
	

			
			
}
