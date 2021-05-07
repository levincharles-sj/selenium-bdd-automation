package Com.Test.Levin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

	@FindBy(how=How.CSS, using="a.login")
	public static WebElement SignIn_Link;
	
	public static class Authentication{
		
		@FindBy(how=How.CSS, using="input#email")
		public static WebElement Email_TxtBox;
		
		@FindBy(how=How.CSS, using="input#passwd")
		public static WebElement Password_TxtBox;
		
		@FindBy(how=How.CSS, using="button#SubmitLogin")
		public static WebElement SignIn_Btn;
		
	}
	
	
}
