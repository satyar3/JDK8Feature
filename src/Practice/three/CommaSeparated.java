package Practice.three;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommaSeparated
{
	/*
	 * Write a method that returns a comma-separated string based on a given list of integers. Each element should be preceded 
	 * by the letter 'e' if the number is even, and preceded by * the letter 'o' if the number is odd. For example, 
	 * if the input list is (3,44), the output should be 'o3,e44'.
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		Function<Integer, String> oddEvenCheckFunction = x -> (x%2 == 0) ? ("e"+x) : ("o"+x);
		
		String result = Arrays.asList(5,6,9,7,2,3)
		.stream()
		.map(oddEvenCheckFunction)
		.collect(Collectors.joining(","));
		
		System.out.println(result);
	}
}
