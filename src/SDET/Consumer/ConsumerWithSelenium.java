package SDET.Consumer;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConsumerWithSelenium
{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(@Optional("chrome") String browser)
	{
		this.driver = DriverFactory.getDriver(browser).get();
		DriverFactory.getServiceName("DBService").accept("Connected DBService");
	}
	
	
	@Test
	public void test()
	{
		this.driver.get("https://www.google.com");
		driver.findElements(By.name("q")).forEach(x -> System.out.print(x.getText()));
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
	
	private static Consumer<String> dbService = x -> {
			System.out.println("Connectting to DB Service");
			System.out.println("Connected to DB");
		};
	private static Consumer<String> logService = x -> System.out.println("Connected to Log Service");
	private static Consumer<String> openCOnnection = dbService.andThen(logService);
	
	private static final HashMap<String, Consumer<String>> CONNECTION_SERVICE = new HashMap<>();
	
	static
	{	
		CONNECTION_SERVICE.put("DBService",dbService);
		CONNECTION_SERVICE.put("LogService",logService);
		CONNECTION_SERVICE.put("BothService",openCOnnection);
	}
	
	public static Consumer<String> getServiceName(String serviceName)
	{
		return CONNECTION_SERVICE.get(System.getProperty(serviceName));
	}
}
