package Practice.three;

import java.util.Arrays;

public class FilterStrings
{
	/*Given a list of strings, write a method that returns a list of all strings that 
	 * start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.*/
	
	public static void main(String[] args)
	{
		
		Arrays.asList("Java", "8", "Lambdas" , "snd" , "Streams" ,"API's")
		.stream()
		.filter(x -> x.toLowerCase().startsWith("s"))
		.filter(x -> x.length() == 3)
		.forEach(System.out::println);
	}
}
