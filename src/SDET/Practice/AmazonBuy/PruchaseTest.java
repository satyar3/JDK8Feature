package SDET.Practice.AmazonBuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;
import static SDET.Practice.AmazonBuy.PurchaseActions.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class PruchaseTest
{
	@Test(dataProvider="paymentScenarios")
	public void testPayment(Consumer<PurchasePage> action)
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		PurchasePage page = new PurchasePage(driver);		
		page.goTo();
		action.accept(page);
		
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
		
		driver.quit();
	}
	
	@DataProvider(name="paymentScenarios")
	private Object[] testScenarios()
	{		
		return new Object[]{
				
				FREECUPON.andThen(BUY_NOW).andThen(GET_STATUS).andThen(ASSERT_STATUS_PASS),
				PARTIALCUPON.andThen(BUY_NOW).andThen(GET_STATUS).andThen(ASSERT_STATUS_FAIL),
				PARTIALCUPON.andThen(ENTER_VALID_CC_DETAILS).andThen(BUY_NOW).andThen(GET_STATUS).andThen(ASSERT_STATUS_PASS),
				PARTIALCUPON.andThen(ENTER_INVALID_CC_DETAILS).andThen(BUY_NOW).andThen(GET_STATUS).andThen(ASSERT_STATUS_FAIL),
		};
	}
}
