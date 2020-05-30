package FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap
{

	public static void main(String[] args)
	{
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		Customer cust3 = new Customer();
		
		cust1.setName("emp 1");
		cust1.addDevice("mac1");
		cust1.addDevice("mac2");
		cust1.addDevice("mac3");		
		
		cust2.setName("emp 2");
		cust2.addDevice("sam1");
		cust2.addDevice("sam2");
		cust2.addDevice("sam3");
		cust2.addDevice("sam3");
		
		cust3.setName("emp 3");
		cust3.addDevice("book1");
		cust3.addDevice("book2");
		cust3.addDevice("book3");
		
		List<Customer> cusList = new ArrayList<Customer>();
		
		cusList.add(cust1);
		cusList.add(cust2);
		cusList.add(cust3);
		
		List<String> distinctList = cusList.stream()
				.map(x -> x.getDevice())
				.flatMap(x -> x.stream())
				.distinct()
				.filter(x -> x.contains("mac"))
				.collect(Collectors.toList());
		
		distinctList.forEach(x -> System.out.println(x));
	}

}
