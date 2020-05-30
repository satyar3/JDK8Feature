package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap
{
	public static void main(String[] args)
	{
		List<Customer> customerList = Arrays.asList(
				new Customer("satya", 13),
				new Customer("ram", 14),
				new Customer("dam", 16)
				);
		
		String cus = customerList.stream().filter(x -> x.getName().contains("dam"))
		.map(Customer::getName)
		.findAny()
		.orElse(null);
		
		System.out.println(cus);
		
		System.out.println("*************************");
		
		List<String> customerListString = customerList.stream().map(Customer::getName).collect(Collectors.toList());
		customerListString.forEach(x -> System.out.println(x));
		
	}
}
