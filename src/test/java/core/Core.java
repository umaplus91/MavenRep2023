package core;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class Core {
	public WebDriver driver = null;
	public WebDriverWait wait;
	public long implicitTime = 20;
	public long explicitTime = 30;
	
	
	@BeforeMethod
	public void setup() {
		
	
	    String page = "chrome"; 
	
	    
		System.setProperty("webdriver.edge.driver" , "D:\\programs\\Webdriver\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver " , " D:\\programs\\Webdriver\\chromedriver.exe ");
		System.setProperty("webdriver.firefox.driver" , "D:\\programs\\Webdriver\\geckodriver.exe");
		
		
		
		//option.setExperimentalOption("exludeSwitches",Arrays.asList("disable-poup-blocking"));
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");

		if (page == "edge") {
			driver = new  EdgeDriver() ;
		} else if (page == "chrome") {
			driver = new ChromeDriver();
		}else if (page == "FireFox") {
			driver = new FirefoxDriver(); 
		}
		//option.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		
		//Explicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTime));
		
		
		}
	
}

