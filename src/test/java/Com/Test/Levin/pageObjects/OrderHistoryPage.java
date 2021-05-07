package Com.Test.Levin.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderHistoryPage {
	
	
	@FindBy(how=How.XPATH, using="//table[@id='order-list']/tbody/tr/td[1]/a")
	public static List<WebElement> OrderReferences;

	
}
