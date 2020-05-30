package Streams.ParallelStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStrem
{
	public static void main(String[] args)
	{
		System.out.println(isPrime(7));
		System.out.println(isPrime(9));
		
		
		long count = Stream.iterate(0, x -> x+1).limit(10)
		.filter(PrimeNumberWithParallelStrem :: isPrime)
		.peek(x -> System.out.println(x))
		.count();
		
		System.out.println("Total number of prime numbers within the range is : "+count);
		
		//Using parallelstream approach
		IntStream.rangeClosed(0, 1000).parallel().filter(PrimeNumberWithParallelStrem::isPrime).peek(System.out::println).count();
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		
		return ! IntStream.rangeClosed(2, n/2).anyMatch(x -> n%x == 0);
	}
}
