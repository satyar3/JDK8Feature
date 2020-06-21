package Practice.three;

import java.util.stream.IntStream;

public class LinearSearch
{
	//https://code-exercises.com/programming/tags/java8-lambdas-streams/

	/*Write a method that returns the index of the first occurrence of given integer in a list.
	Assume that the index of the first element in the list is zero.
	If the number does not exist return -1.*/

	public static void main(String[] args)
	{
		Integer[] list = {5,7,2,9,3,8,5,8,5};
		
		IntStream.rangeClosed(0, list.length-1)
		.filter(x -> list[x] == 7)
		.findFirst().orElse(-1);
		
	}
}
