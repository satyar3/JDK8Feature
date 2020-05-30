package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect
{
	public static void main(String[] args)
	{
		List<String> prodcutList = Arrays.asList("Phone", "Shoe", "Battery", "mobile","bat");
		
		prodcutList = prodcutList.stream().
			filter(x -> ! (x.equals("Shoe") || x.startsWith("B"))).
			collect(Collectors.toList());
			
		//System.out.println(prodcutList);
		
		prodcutList.forEach(x -> System.out.println(x));
		prodcutList.forEach(System.out::println);
	}
}
