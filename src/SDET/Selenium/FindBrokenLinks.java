package SDET.Selenium;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		
		Predicate<String> condition = text -> text.trim().length() >0;		
		
		System.out.println(
				"Do I have any broken links :: "+
		
		//Another way of using Map				
		allLinks.stream()
			.map(el -> getAttribute(el))
			.noneMatch(condition)
			
		);
		
		driver.quit();
	}
	
	public static String getAttribute(WebElement el)
	{
		return el.getAttribute("href");
	}
}
