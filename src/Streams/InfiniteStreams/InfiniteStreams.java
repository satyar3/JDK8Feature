package Streams.InfiniteStreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams
{

	public static void main(String[] args)
	{
		
		//Infinite streams used to generate infinite streams of data
		
		//1- using iterate()
		//It'll take two parameters --> seed and unarayOperator --> return Stream
		
		List<Integer> listOfInte = IntStream.iterate(1, x -> x*3)
		.mapToObj(Integer :: valueOf)
		.limit(10)
		.collect(Collectors.toList());
		
		System.out.println(listOfInte);
		
		//2- using generate()		
		List<Integer> randList = Stream.generate(() -> (new Random()).nextInt(100))
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println(randList);
	
	}
	

}
