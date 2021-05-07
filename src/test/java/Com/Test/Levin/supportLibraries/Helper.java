package Com.Test.Levin.supportLibraries;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	public static String getFileSeparator() {
		return System.getProperty("file.separator");
	}

	public static String getAbsolutePath() {
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		return relativePath;
	}
	
	static Logger log = Logger.getLogger(Helper.class);
	
	public WebDriver launchApp(String url) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", getAbsolutePath()+getFileSeparator()+"Drivers"+getFileSeparator()+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	public void waitUntilElementVisible(WebDriver driver, WebElement element, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions
				.visibilityOf(element));
	}
	
	public void waitUntilElementClickable(WebDriver driver, WebElement element, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions
				.elementToBeClickable(element));
	}
	
	public Boolean IsElementExists(WebElement element) {
		Boolean elementStatus =false;
		try {
			if(element!=null) {
				elementStatus = true;
			}
		}catch(NoSuchElementException e) {
			return false;
		}
		return elementStatus;
	}
	
	public WebElement locateElement(WebDriver driver, By locator){
		
		WebElement element = null;
		
		try{
			element = driver.findElement(locator);	
		}catch(Exception e){}
		
		return element;
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
		if(IsElementExists(element)){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}else{
			log.error("Unable to scroll. Element doesn't exists!!");
		}
	}
	
	public void scrollToElementAndClick(WebDriver driver, WebElement element) {
		scrollToElement(driver, element);
		element.click();
	}
	
	public void moveFocusToElement(WebDriver driver, WebElement element) {
		if(IsElementExists(element)){
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}else{
			log.error("Unable to move focus to the element. Element doesn't exists!!");
		}
	}	
	
}
