package SDET.Streams.Parallel;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelStreamConcept
{
	public static void main(String[] args)
	{
		
		ForkJoinPool.commonPool();
		int numberOfCoreInSys = ForkJoinPool.getCommonPoolParallelism();
		System.out.println("numberOfCoreInSys :: "+numberOfCoreInSys);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		
		allLinks.stream()
			.parallel()
			.forEach(System.out::println);			
		
		driver.quit();
		System.exit(0);
	}
}
