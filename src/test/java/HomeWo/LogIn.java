package HomeWo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	
	private WebDriver driver = null;
	

	// Locators
	By usernameBox = By.name("username");
	By passwordBox = By.name("password");
	By clickBtn = By.cssSelector("input[value='Log In']");
	
	//Constructor
	public LogIn(WebDriver driver) {
		this.driver=driver;
		
	}
	
	// actions on element
	public void insertUsername (String username) {
		driver.findElement(usernameBox).sendKeys(username);
	}
	public void insertPassword(String password) {
		driver.findElement(passwordBox).sendKeys(password);
	}
	public void clickLoginBtn() {
		driver.findElement(clickBtn).click();
	}

}
