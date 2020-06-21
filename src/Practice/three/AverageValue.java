package Practice.three;

import java.util.stream.IntStream;

public class AverageValue
{
	
	//Write a method that returns the average of a list of integers.
	
	public static void main(String[] args)
	{
		Double avg = IntStream.rangeClosed(5, 10)
		.average()
		.orElse(-1);
		
		System.out.println(avg);
	}
}
