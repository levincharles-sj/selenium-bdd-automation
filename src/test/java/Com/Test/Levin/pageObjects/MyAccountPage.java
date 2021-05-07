package Com.Test.Levin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
	
	@FindBy(how=How.CSS, using="a[title='Information']")
	public static WebElement My_Personal_Information_Btn;
	
	public static class Your_Personal_Information{
		
		@FindBy(how=How.CSS, using="input#firstname")
		public static WebElement Firstname_TxtBox;
		
		@FindBy(how=How.CSS, using="input#old_passwd")
		public static WebElement CurrentPassword_TxtBox;
		
		@FindBy(how=How.CSS, using="button[name='submitIdentity']")
		public static WebElement Save_btn;
		
		@FindBy(how=How.CSS, using="p.alert.alert-success")
		public static WebElement Success_Message;
		
		public static String successMessage_ExpectedTxt = "Your personal information has been successfully updated.";
		
	}

}
