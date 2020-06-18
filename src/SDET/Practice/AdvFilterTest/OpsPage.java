package SDET.Practice.AdvFilterTest;

public class OpsPage
{
	public static void applyFilter(String query, String...attribute)
	{
		System.out.println("*******************");
		System.out.println("Ops Page Opened");
		System.out.println("Open filter menu");
		System.out.println("Cleared all filters");
		
		
		for(int i = 0; i<attribute.length; i++)
		{
			query = query.replace("{"+i+"}", attribute[i]);
		}
		
		System.out.println("Apply filter with :: "+query);
		System.out.println("Filter applied");
		System.out.println("Verify");
		System.out.println("*******************");
	}
	
	public static void methodRef(OpsPage test)
	{
		System.out.println("Inside Method ref");
	}
}
