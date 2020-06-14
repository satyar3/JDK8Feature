package SDET.Streams.Terminal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReduceConcept
{
	public static void main(String[] args)
	{
		List<Integer> listInt = new ArrayList<>();

		Collections.addAll(listInt, 1, 2, 3, 4, 5, 6, 7, 8);
		
		listInt.stream()
			.reduce(
					(a,b) -> {
						
						System.out.println(a);
						System.out.println(b);
						return a+b;
						
					});
		
		//Or using single line
		
		listInt.stream().reduce((a,b) -> a+b);
		
	}
}
