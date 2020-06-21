package Practice.three;

import java.util.Arrays;
import java.util.Comparator;

public class FindMax
{
	
	/*Write a method that returns the largest integer in the list.
	You can assume that the list has at least one element.*/
	
	public static void main(String[] args)
	{
		Integer max = Arrays.asList(5,8,3,8,2,8)
		.stream()
		.max(Comparator.naturalOrder())
		.orElse(null);
		
		System.out.println(max);
	}
}
