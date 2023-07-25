package HomeWo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDetails {

	private WebDriver driver;
	By logout = By.xpath("//a[text()='Log Out']");
	By accountnumber = By.xpath("//a[text()='14898']");
	By totalBalance = By.xpath("//b[text()='$100000.00']");
	

	public AccountDetails(WebDriver driver) {
		this.driver = driver;

	}
	public void clicklogout () {
		driver.findElement(logout).click();
	}
	public boolean IslogoutChecked() {
		List<WebElement> logoutelement = driver.findElements(logout);
		return logoutelement.size()>0;
		
	}
	public String getAccountNum() {
	return	driver.findElement(accountnumber).getText();
	}
	public String getTotalBalance() {
		return driver.findElement(totalBalance).getText();
	}

}
