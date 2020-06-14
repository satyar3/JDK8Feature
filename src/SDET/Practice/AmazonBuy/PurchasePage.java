package SDET.Practice.AmazonBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage
{
	private static By CUPON_INPUT = By.cssSelector("#coupon");
	private static By CUPON_BTN = By.cssSelector("#couponbtn");
	private static By CC = By.cssSelector("#cc");
	private static By YEAR = By.cssSelector("#year");
	private static By CVV = By.cssSelector("#cvv");
	private static By BUY_BTN = By.cssSelector("#buy");
	private static By STATUS = By.cssSelector("#status");
	
	private WebDriver driver;
	
	PurchasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void goTo()
	{
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-payment-screen.html");
	}
	
	public void applyCupon(String code)
	{
		driver.findElement(CUPON_INPUT).sendKeys(code);
		driver.findElement(CUPON_BTN).click();
	}
	
	public void enterCCInfo(String ccNum, String year, String cvv)
	{
		driver.findElement(CC).sendKeys(ccNum);
		driver.findElement(YEAR).sendKeys(year);
		driver.findElement(CVV).sendKeys(cvv);		
	}
	
	public void buyNow()
	{
		driver.findElement(BUY_BTN).click();
	}
	
	public String getStatus()
	{
		return driver.findElement(STATUS).getText();
	}
}
