package SDET.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamConcept
{
	public static void main(String[] args)
	{
		List<Integer> listInt = new ArrayList<>();

		Collections.addAll(listInt, 1, 2, 3, 4, 5, 6, 7, 8);
		
		int sum = listInt.stream()
					.mapToInt(x -> x)	// Here Wrapper type Integer is getting converted to premetive type
					.sum();
		
		System.out.println("Sum is " + sum);
		
		IntStream.rangeClosed(0, 10).forEach(x -> System.out.println("Hello :: "+x));
	}
}
