package Streams.ParallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept
{
	public static void main(String[] args)
	{
		ForkJoinPool corePool = ForkJoinPool.commonPool();
		System.out.println(corePool.getParallelism());
		
		
		//1 - parallel() method on stream()
		Stream<String> streamOfStrings = Stream.of("Test1", "Test2", "Test3","Test4","Test5");
		
		//Sequential approach
		streamOfStrings.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		//Parallel approach
		Stream<String> streamOfStrings2 = Stream.of("Test1", "Test2", "Test3","Test4","Test5");
		Stream<String> parallelStreams2 = streamOfStrings2.parallel();
		parallelStreams2.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		//use parallelStream() method on a collection		
		Arrays.asList("Test1", "Test2", "Test3","Test4","Test5").parallelStream().forEach(x -> System.out.println(x));
		
		System.out.println("--------------------------------");
		
		//1 to 10 print using seq stream
		Stream.iterate(0, n -> n+1).limit(10).forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		//Using parallelStream()
		
		//Difference between range and range closed is, in rangeClosed() --> end is inclusive
		
		IntStream.range(0, 10).parallel().forEach(x -> System.out.println(x));
		IntStream.rangeClosed(100, 110).parallel().forEach(x -> System.out.println(x));
		
		System.out.println("--------------------------------");
		
		//to print a -z --> 97 - 122
		//Using seq stram
		getAlphaList().forEach(System.out::println);
		System.out.println("--------------------------------");
		getAlphaList().parallelStream().forEach(System.out::println);
		System.out.println("--------------------------------");
		
		//Check if stream is running parallel
		boolean isParallel = IntStream.rangeClosed(100, 110).isParallel();
		System.out.println(isParallel);
		
		boolean runPrallel = IntStream.rangeClosed(100, 110).parallel().isParallel();
		System.out.println(runPrallel);
	}
	
	public static List<String> getAlphaList()
	{
		List<String> alphaList = new ArrayList<>();
		int index = 97;
		while(index <= 122)
		{
			char c = (char) index;
			alphaList.add(String.valueOf(c));
			index++;
		}
		
		return alphaList;
	}
}
