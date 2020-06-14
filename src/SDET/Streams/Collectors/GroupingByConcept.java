package SDET.Streams.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByConcept
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//grouping by length of the element
		Function<String, Integer> fun = (x) -> x.length();
		
		Map<Integer, List<String>> map =  list.stream().collect(Collectors.groupingBy(fun));
		
		map.forEach(
				(k,v) -> {
					
					System.out.println("Key : "+k);
					System.out.println("Value : "+v);
				});
		
	}
}
