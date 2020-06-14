package SDET.Streams.Intermidiate;

import java.util.ArrayList;
import java.util.List;

public class SkipConcept
{
	public static void main(String[] args)
	{
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(1);
		intList.add(9);
		intList.add(2);

		intList.stream().
			skip(2).
			peek(x -> System.out.println("in Peek : " + x)).
			map(x -> x * 2).forEach(System.out::println);
	}
}
