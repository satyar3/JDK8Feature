package SDET.Supplier;

import java.util.HashMap;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SupplierInSelenium
{
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(@Optional("chrome") String browser)
	{
		this.driver = DriverFactory.getDriver(browser).get();
	}
	
	
	@Test
	public void test()
	{
		this.driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void tearDown()
	{
		this.driver.quit();
	}
}


class DriverFactory
{
	private static Supplier<WebDriver> chromeDriver = () -> {		
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	};
	
	private static Supplier<WebDriver> FFDriver = () -> {		
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	};
	
	private static final HashMap<String, Supplier<WebDriver>> MAP = new HashMap<>();
	
	static
	{
		MAP.put("chrome", chromeDriver);
		MAP.put("firefox", FFDriver);
	}
	
	public static Supplier<WebDriver> getDriver(String browser)
	{
		return MAP.get(browser);
	}
}
