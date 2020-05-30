package SelenumScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWithJDK8
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Totail Nos. of Link : "+linksList.size());
		
		
		//1 - 
		//linksList.forEach(el -> System.out.println(el.getText()));
		
		
		//2 - 
		//linksList.stream().filter(el -> (el.getText().length()>0)).forEach(el -> System.out.println(el.getText()));
		
		//3 - 
		//linksList.stream().filter(el -> el.getText().length() > 0).map(el -> el.getText()).forEach(System.out::println);
		
		//4 - 
		//List<String> linkListText = linksList.stream().filter(el -> el.getText().length() > 0).map(el -> el.getText()).collect(Collectors.toList());
		//linkListText.forEach(System.out::println);
		
		//5 - 
		//linksList.stream().filter(el -> el.getText().length()>0).findFirst().map(el -> el.getText()).ifPresent(System.out::println);
		//String firstText = linksList.stream().filter(el -> el.getText().length()>0).findFirst().get().getText();
		//System.out.println(firstText);
		
		//6 - 
		//String anyElementText = linksList.stream().filter(el -> el.getText().length()>0).findAny().get().getText();
		//System.out.println(anyElementText);
		
		//7 - 
		//linksList.stream().filter(el -> el.getText().length() > 0 && el.getText().startsWith("Amazon")).map(el -> el.getText()).forEach(System.out::println);
		
		//8 - 
		/*linksList.stream().filter(el -> !el.getText().isEmpty())
				.filter(el -> ! el.getText().startsWith(" "))
				.map(el -> el.getText().trim())
				.forEach(System.out::println);*/
		
		
		driver.quit();
	}
}
