package SDET.Streams.Intermidiate;

import java.util.ArrayList;
import java.util.List;

public class SortConcept
{
	public static void main(String[] args)
	{
		//Without sort
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(1);
		intList.add(9);
		intList.add(2);
		
		intList.stream()
			.map(x -> {				
					System.out.println("Inside Map");
					return x*2;
				})
				.forEach(System.out::println);
		
		System.out.println("********************************************************");

		//With sort		
		intList.stream()
		.map(x -> {				
				System.out.println("Inside Map");
				return x*2;
			})
			.sorted()
			.forEach(System.out::println);
	}
}
