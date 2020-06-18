package SDET.CheckBoxAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAssignment
{
	@Test
	public void funCheckBox()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-1.html");
				
		//Task - 1
		//List of all check boxes
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		//Select all the check boxes
		checkBoxList.stream()
		.forEach(WebElement::click);
		
		
		//Task - 2
		List<WebElement> listofTrs = driver.findElements(By.cssSelector("table tr"));		
		Predicate<List<WebElement>> malePredicate = el -> el.get(1).getText().equalsIgnoreCase("male");
		Predicate<List<WebElement>> listSizeCheck = el -> el.size() == 4;
		
		//Select boxes where gender is Male
		listofTrs.stream()
		.skip(1)
		.map(eachTr -> eachTr.findElements(By.tagName("td"))) //TD List
		.filter(listSizeCheck)
		.filter(malePredicate) //Filter TD with Male
		.map(el -> el.get(3)) // Get all TDS with index 3
		.map(el -> el.findElement(By.tagName("input"))) //Get all the element with tag input from 3rd index of td tag list
		.forEach(WebElement::click);
		
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		
		driver.quit();
		
	}
}
