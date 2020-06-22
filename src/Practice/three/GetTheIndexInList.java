package Practice.three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GetTheIndexInList
{
	
	//In a given array list get the index where the value is present
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
				
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("two");
		list.add("four");
	

		//First matching index of desired value
		Integer indexOfDesiredValue = IntStream.range(0, list.size())
		.filter(i -> list.get(i).equalsIgnoreCase("three"))
		.findFirst()
		.orElse(-1);
		
		System.out.println("Index of desired value is :: "+indexOfDesiredValue);
		
		
		//List of all indexed matching desired value
		
		List<Integer> desiredIndexList = new ArrayList<>();
		IntStream.range(0, list.size())
		.filter(i -> list.get(i).equalsIgnoreCase("two"))
		.forEach(desiredIndex -> desiredIndexList.add(desiredIndex));
		
		System.out.println(desiredIndexList);
		
		//Another Way:		
		/*
		//Any mutable integer wrapper
		AtomicInteger i = new AtomicInteger(); 
		int index = adultPriceList.stream()
		    .peek(v -> i.incrementAndGet())
		    .anyMatch(el -> el.getText().contains(minPrice)) ? i.get() - 1 : -1;
		
		System.out.println("Index is :: "+index);   
		*/
		
	}
}
