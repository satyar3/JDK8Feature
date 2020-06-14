package SDET.Streams.Terminal;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchOrNonMatchConcept
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		//Usage:
		//Do you have any element which is > 2 --> returns boolean
		
		System.out.println(
		list.stream()
			.anyMatch(num -> num>2)
			);
		
		
		//Usage:
		//Do you have none element which is > 5 --> returns boolean
		System.out.println(
				list.stream()
					.noneMatch(num -> num>5)
					);
	}
}
