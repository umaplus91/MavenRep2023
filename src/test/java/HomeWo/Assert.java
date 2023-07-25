package HomeWo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Assert extends core.Core {
	//@Test
	public void Alert() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://www.letskodeit.com/practice");
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		// scroll.executeAsyncScript("window.scrollBy(0,100)");
		Thread.sleep(1000);

		driver.findElement(By.id("alertbtn")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		// wait.until(ExpectedConditions.alertIsPresent());
		// driver.switchTo().alert().accept();

	}

	@Test
	public void ParaBank() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		LogIn login = new LogIn(driver);
		AccountDetails accountsdetails = new AccountDetails(driver);
		
		login.insertUsername("uma"); //driver.findElement(By.name("username")).sendKeys("uma");
		login.insertPassword("uma123"); //driver.findElement(By.name("password")).sendKeys("uma123");
		login.clickLoginBtn(); //driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
		//Verification
		//List<WebElement> logout = driver.findElements(By.xpath("//a[text()='Log Out']"));
		assertTrue(accountsdetails.IslogoutChecked());  //assertEquals(logout.size(),1);
		
		
		//String accountNumber = driver.findElement(By.xpath("//a[text()='22224']")).getText();
		assertEquals(accountsdetails.getAccountNum(),"14898"); //assertEquals(accountNumber, "22224");
		
		
		//String TotalBalance = driver.findElement(By.xpath("//b[text()='$100000.00']")).getText(); 
		assertEquals(accountsdetails.getTotalBalance(),"$100000.00"); //assertEquals(TotalBalance,"$100000.00");
		
		

	}

}
