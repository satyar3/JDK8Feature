package SDET.Practice.HoverAssignment;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverAssignment
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Actions action = new Actions(driver);
		
		driver.get("https://vins-udemy.s3.amazonaws.com/java/html/drop-down.html");
		
		String path = "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.4 => Dropdown Submenu Link 5.4.2";
		String[] dropdownArray = path.split("=>");
		
		Arrays.stream(dropdownArray)
			.map(linkInArr -> driver.findElement(By.linkText(linkInArr.trim())))
			.map(el -> action.moveToElement(el))
			.forEach(el -> el.perform());
		
	}
}
