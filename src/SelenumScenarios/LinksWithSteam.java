package SelenumScenarios;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithSteam
{
	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://freshworks.com");
		
		List<WebElement> footerList = driver.findElements(By.cssSelector("ul.footer-nav li"));
		
		List<String> newFooterList = new ArrayList<String>();
		
		footerList.stream().forEach(el -> newFooterList.add(el.getText()));
		newFooterList.forEach(System.out::println);
		
		driver.quit();
		
	}
}
