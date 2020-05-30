package Streams.SeqStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams
{
	public static void main(String[] args)
	{
		
		//Strem of strings
		Stream<String> streams = Stream.of("Satya","Test","World");				
		streams.forEach(x -> System.out.println(x));			
		
		System.out.println("*********************************");
		
		//Once the stream is closed we can't use it again
		//streams.findFirst().ifPresent(x -> System.out.println(x));
		
		System.out.println("*********************************");
		
		List<String> stringList = Arrays.asList("a1","a2","a3");
		stringList.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("*********************************");
		
		//IntStream intSream = IntStream.of(1,2,3,5);
		IntStream intSream = IntStream.range(1, 5);
		intSream.forEach(System.out::println);
		
		System.out.println("*********************************");
		
		//Range
		Arrays.stream(new int[] {1,2,3,4}).map(x -> 2*x+1)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println("*********************************");
		
		Arrays.stream(new int[] {1,2,3,4}).map(x -> 2*x+1)
		.forEach(x -> System.out.println(x));
		
		System.out.println("*********************************");
		
		//String data objects
		Stream.of("a1","a2","a3").map(x -> x.substring(1)).mapToInt(x -> Integer.parseInt(x)).filter(x -> x > 1).forEach(System.out::println);
		
		System.out.println("*********************************");
		
		//double to string objects
		Stream.of(1.0, 2.0, 3.0)
		.mapToInt(Double :: intValue)
		.mapToObj(x -> "A"+x)
		.forEach(System.out::println);
		
		System.out.println("*********************************");
		
		//Limit
		Stream.iterate(0, n -> n+1).limit(10).forEach(System.out::println);
		
		System.out.println("*********************************");
		
		//print 10 odd numbers
		Stream.iterate(0, n -> n+1).limit(10).filter(x -> !(x%2 == 0)).forEach(x -> System.out.println(x));
		
		System.out.println("*********************************");
		
		//print 10 even numbers
		Stream.iterate(0, n -> n+1).limit(10).filter(x -> (x%2 == 0)).forEach(x -> System.out.println(x));
		
		System.out.println("*********************************");
		
	}
}
