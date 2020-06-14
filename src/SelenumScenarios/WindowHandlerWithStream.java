package SelenumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithStream
{
	public static void main(String[] args) throws RuntimeException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		System.out.println(windowHandler(driver, "PopupTest Saturday"));
		/*//System.out.println(winDowHandler(driver, "PopupTest"));
		
		driver.close();
		winDowHandler(driver, "PopupTest");
		System.out.println(winDowHandler(driver, "PopupTest"));*/
		driver.quit();
		
	}
	
	public static String windowHandler(WebDriver driver, String title) throws RuntimeException
	{
		return 
				driver.getWindowHandles()
					.stream()
						.map(handler -> driver.switchTo().window(handler).getTitle())
							.filter(handler -> handler.contains(title))
								.findFirst()
									.orElseThrow(() -> { throw new RuntimeException("WindowNotFoundException"); } );
	}
}
