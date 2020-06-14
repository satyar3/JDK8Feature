package SDET.Practice.AmazonBuy;

import java.util.function.Consumer;

import org.testng.Assert;

public class PurchaseActions
{
	public static final Consumer<PurchasePage> FREECUPON = p -> p.applyCupon("FREEUDEMY");
	public static final Consumer<PurchasePage> PARTIALCUPON = p -> p.applyCupon("PARTIALUDEMY");
	public static final Consumer<PurchasePage> ENTER_VALID_CC_DETAILS = p -> p.enterCCInfo("4111111111111111", "2023", "123");
	public static final Consumer<PurchasePage> ENTER_INVALID_CC_DETAILS = p -> p.enterCCInfo("4111111111111112", "2023", "123");
	public static final Consumer<PurchasePage> BUY_NOW = p -> p.buyNow();
	public static final Consumer<PurchasePage> GET_STATUS = p -> p.getStatus();
	public static final Consumer<PurchasePage> ASSERT_STATUS_PASS = p -> Assert.assertEquals(p.getStatus(), "PASS");
	public static final Consumer<PurchasePage> ASSERT_STATUS_FAIL = p -> Assert.assertEquals(p.getStatus(), "FAIL");
}
