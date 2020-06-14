package SDET.Streams.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAndJoinAllConcept
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		String joinedString = list.stream().filter(el -> el.length() > 3).collect(Collectors.joining());		
		System.out.println("joinedString :: "+joinedString); 
		
		String joinedALlString = list.stream().filter(el -> el.length() > 3).collect(Collectors.joining(","));
		System.out.println("joinedALlString :: "+joinedALlString); 
		
		
		//Anotherway without join
		String joinedStringUsingReduce = list.stream().reduce((x,y) -> x+","+y).get();
		System.out.println("joinedStringUsingReduce :: "+joinedStringUsingReduce);
		
	}
}
