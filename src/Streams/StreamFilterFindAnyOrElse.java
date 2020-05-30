package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse
{
	public static void main(String[] args)
	{
		// list of customer objects
		
		List<Customer> customerList = Arrays.asList(
				new Customer("satya", 13),
				new Customer("ram", 14),
				new Customer("dam", 16)
				);
		
		
		//Filter with single condition
		Customer cus = customerList.stream() //convert to stream
		.filter(x -> x.getName().contains("ram"))  //filter data that matches
		.findAny() //if it finds return 
		.orElse(null); //else return null
		
		System.out.println(cus.getName());
		System.out.println(cus.getAge());
		
		System.out.println("-----------------------------------");
		
		//flter with multiple conditions
		Customer cus2 = customerList.stream() //convert to stream
				.filter(x -> x.getName().contains("ram") || x.getAge() == 0)  //filter data that matches
				.findAny() //if it finds return 
				.orElse(null); //else return null
				
				System.out.println(cus2.getName());
				System.out.println(cus2.getAge());
	}
}
