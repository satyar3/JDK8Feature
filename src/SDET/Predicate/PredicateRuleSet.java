package SDET.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PredicateRuleSet
{
	//e.g.
	//Rule - 1
	private static Predicate<WebElement> pred1 = x -> x.getText().charAt(0) == 'A';
	
	//Rule - 2
	private static Predicate<WebElement> pred2 = x -> x.getText().length() == 0;
		
	
	public static List<Predicate<WebElement>> ruleSet()
	{
		List<Predicate<WebElement>> ruleList = new ArrayList<Predicate<WebElement>>();
		ruleList.add(pred1);
		ruleList.add(pred2);
		
		return ruleList;
	}
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> elementList = driver.findElements(By.name("q"));
		
		List<Predicate<WebElement>> ruleSetRes = ruleSet();		
		ruleSetRes.forEach(eachRule -> elementList.removeIf(eachRule));
		
		// or by using method reference		
		ruleSetRes.forEach(elementList::removeIf);
		
	}
		
}
