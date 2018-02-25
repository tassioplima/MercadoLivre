package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Navegation {

	private static WebDriver driver;
	private static WebDriverWait driverWait;
	private static int timeWait = 30000;

	@Before
	public static WebDriver getChromeDriver() {
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static WebDriverWait getWebDriverWait() {
		if (driverWait == null)
			driverWait = new WebDriverWait(driver, timeWait);
		return driverWait;
	}

	@After
	public static void tearDown() {
		driver.close();
	}

}
