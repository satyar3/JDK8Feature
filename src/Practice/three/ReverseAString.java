package Practice.three;

import java.util.stream.Stream;

public class ReverseAString
{	
	
	/*Write a method that reverses a string.
	For example, 'java interview' becomes 'weivretni avaj'.*/
	
	public static void main(String[] args)
	{
		String s = "java interview";

		Stream.of(s)
		.map(x -> new StringBuffer(x).reverse())
		.forEach(System.out::println);

	}
}
