package Practice.three;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCheck
{
	
	//Find duplicate elements in an array
	public static void main(String[] args)
	{
		String[] arr = {"java", "python","java", "js",".net","js"};
		
		/*
		//Way-1
		Set<String> set = new HashSet<>();
		Function<String, Boolean> groupByBoolean = x -> set.add(x);
		
		Map<Boolean, List<String>> groupMap = Stream.of(arr)
		.collect(Collectors.groupingBy(groupByBoolean));
		
		groupMap.forEach( (k,v) -> {
			if(k == false)
				System.out.println(v);
		});
		*/
		
		
		//Way-2		
		Function<String, String> groupByString = x -> x;
		 Stream.of(arr)
		 .collect(Collectors.groupingBy(groupByString))
		 .forEach((k,v) -> {

			 if(v.size() > 1)
				 System.out.println(k);
		 });
	}
}
