package SDET.Practice.AdvFilterTest;

import static SDET.Practice.AdvFilterTest.OpsPage.applyFilter;

import java.util.function.Consumer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpsTest
{
	@Test(dataProvider = "filterCriteria")
	public void funTest(Consumer<OpsPage> op)
	{
		OpsPage opPage = new OpsPage();
		op.accept(opPage);
	}

	@DataProvider(name = "filterCriteria")
	public Object[] filters()
	{

		final Consumer<OpsPage> FL_NUM_CRITERIA = OpsPage -> applyFilter("arr.flNo={0}", "123");
		final Consumer<OpsPage> AL_NUM_CRITERIA = OpsPage -> applyFilter("arr.AlNo>{0}", "456");
		final Consumer<OpsPage> BAG_COUNT = OpsPage -> applyFilter("bgCount!={0}", "789");
		final Consumer<OpsPage> MULTI_COUNT = OpsPage ->applyFilter("filterOne={0} and filterTwo>{1} and filterThree!={2}", "123", "456", "789");
		final Consumer<OpsPage> METHOD_REF_CHECK = OpsPage::methodRef;

		return new Object[] 
				{ 
						FL_NUM_CRITERIA, AL_NUM_CRITERIA, BAG_COUNT, MULTI_COUNT,METHOD_REF_CHECK
				};

	}

}
