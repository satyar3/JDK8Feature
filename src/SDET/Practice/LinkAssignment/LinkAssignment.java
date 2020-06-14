package SDET.Practice.LinkAssignment;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAssignment
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-price.html");
		
		//get all TRs
		List<WebElement> allTrsList = driver.findElements(By.cssSelector("table#prods tbody tr"));
		
		
		//Fetch the third tr text from the list
		Function<List<WebElement>, Integer> price = element -> Integer.parseInt(element.get(2).getText());
		
		
		Optional<List<WebElement>> minTdList = 
				
				allTrsList.stream()
						.skip(1) //skipping as first is table header
						.map(tr -> tr.findElements(By.tagName("td"))) //fetch all td within that TR
						.min(Comparator.comparing(price)); //It'll return the list of td having the min price
		
		//get the 4th td element and get the input tag and click
		minTdList.get().get(3).findElement(By.tagName("input")).click();
		
		driver.quit();
	}
}
