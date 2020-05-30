package FlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StremsWithStringArrayWithFlatMap
{

	public static void main(String[] args)
	{
		//Flatmap is used for Streams of datatypes with arrays or list of objects or set of objects
		
		//e.g Stream<List<String>> or Stream<String[]> or Stream<Set<String>> --> direct filter is not allowed, we need to 
		// use flat map to apply filter
		
		String [][] data = new String[][]
				{
					{"a","b"}, {"c","d"},{"e","f"}
				};
			
				
				//Below approch is not allowed
				/*Stream<String[]> dataStream = 	Arrays.stream(data);
				Stream<String[]> filteredStream = dataStream.filter(x -> x.toString().equals("e"));
				filteredStream.forEach(x -> System.out.println(x));*/
				
				//using flatmap
				Stream<String[]> dataStream = 	Arrays.stream(data);
				Stream<String> filteredMapStream = dataStream.flatMap(x -> Arrays.stream(x));
				Stream<String> filteredStream = filteredMapStream.filter(x -> x.equals("e"));
				filteredStream.forEach(x -> System.out.println(x));
				
				
				//Composite Action
				Arrays.stream(data)
					.flatMap(x -> Arrays.stream(x))
					.filter(x -> x.equals("f"))
					.forEach(System.out::println);
	}

}
