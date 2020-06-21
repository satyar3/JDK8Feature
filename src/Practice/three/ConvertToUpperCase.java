package Practice.three;

import java.util.stream.Stream;

public class ConvertToUpperCase
{
	//Write a method that converts all strings in a list to their upper case.
	public static void main(String[] args)
	{
		Stream.of("Testing of")
		.map(x -> x.toUpperCase())
		.forEach(System.out::println);
	}
}
