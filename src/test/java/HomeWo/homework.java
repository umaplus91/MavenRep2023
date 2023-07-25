package HomeWo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import core.Core;

public class homework extends Core {

	// @Test
	public void rls() throws InterruptedException {
		driver.get("https://www.rolls-roycemotorcars.com/");
		String actual = driver.getTitle();
		System.out.println("Tittle= " + actual);
		Thread.sleep(1000);

	}

	// @Test
	public void dlr() throws InterruptedException {
		driver.get("https://www.globalsqa.com/demo-site/sorting/");
		String actualtitle = driver.getTitle();
		System.out.println("Title= " + actualtitle);
		String expectedTitle = "Target : Expect More. Pay Les";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualtitle, "Target : Expect More. Pay Less.", "Unknown");
		// assertEquals(actualtitle, expectedTitle, "Unknown");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("old");
		Thread.sleep(2000);

		search.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		search.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		search.sendKeys(Keys.DOWN);

	}

	// @Test
	public void Actions() throws InterruptedException {
		driver.get("https://www.globalsqa.com/demo-site/sorting/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("menu-item-2822"));
		Actions actions = new Actions(driver);
		actions.moveToElement(search).build().perform();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.id("menu-item-2823"));
		actions.moveToElement(menu).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-2999")).click();
		Thread.sleep(2000);

	}

	// @Test
	public void iframes() throws InterruptedException {
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(1000);
		driver.findElement(By.id("iFrame")).click();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		scroll.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		driver.switchTo().frame("globalSqa");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("s"));
		search.sendKeys("SQL");
		Thread.sleep(1000);
		search.clear();
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Permalink to Selenium 3.0 Training']")).click();
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		scroll.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(500);
		driver.findElement(By.id("mobile_menu_toggler")).click();
		// driver.findElement(By.xpath("(//li[@class='menu-item menu-item-type-post_type
		// menu-item-object-page menu-item-home current-menu-item page_item
		// page-item-1397 current_page_item menu-item-1513'])[2]")).click();
		// driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/cheatsheets/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile_menu_toggler")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@id='menu-item-1513'])[1]")).click();
		Thread.sleep(1000);

	}

	// @Test
	public void DragAndDrop() throws InterruptedException {
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		driver.switchTo().frame(2);
		Thread.sleep(4000);
		WebElement source = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		WebElement target = driver.findElement(By.id("trash"));
		WebElement target2 = driver.findElement(By.id("gallery"));
		actions.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);

		WebElement source2 = driver.findElement(
				By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));
		actions.dragAndDrop(source2, target).build().perform();
		Thread.sleep(3000);
		actions.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(source, target2).build().perform();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-1513")).click();

	}

	
	
}
