package FlatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap
{

	public static void main(String[] args)
	{
		
		int [] data = {1,2,3,4,5};
		
		Stream<int[]> streamOfIntArr = Stream.of(data);
		
		IntStream intStream = streamOfIntArr.flatMapToInt(x -> Arrays.stream(x));
		
		intStream.filter(x -> x>3).forEach(x -> System.out.println(x));

	}

}
