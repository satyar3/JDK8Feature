package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoDArayWIthStreams
{
	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[] arr2 = { 1, 2, 3, 4, 5 };

		Stream.of(arr).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
		Stream.of(arr2).flatMapToInt(x -> Arrays.stream(x)).forEach(x -> System.out.println(x));		
	}
}
