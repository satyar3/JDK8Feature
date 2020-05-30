package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept
{
	public static void main(String[] args)
	{
		//Represents a predicate (boolean-valued function) of one argument
		
		//Test
		Predicate<Integer> func = x -> x > 5;		
		boolean flag = func.test(6);		
		System.out.println(flag);
		
		
		//AND
		Predicate<Integer> func2 = x -> x < 10;		
		Predicate<Integer> fun3 = func2.and(func);
		//func2.and(func).test(7); //this means func.test(7) AND func2.test(7) and it'll be AND Condition
		boolean flag2 = fun3.test(7);
		System.out.println(flag2);		
		
		//Using Streams and Filter
		List<Integer> nums = Arrays.asList(1,3,9,6,2,5,10,8);
		List<Integer> colList = nums.stream().filter(x -> x>3).collect(Collectors.toList());
		System.out.println(colList);
				
		//AND
		List<Integer> colList2 = nums.stream().filter(x -> x > 2 && x <=6).collect(Collectors.toList());
		System.out.println(colList2);
		
		
		//Negate
		List<String> nameList  = Arrays.asList("Saty", "sat" , "S", "Jav" ,"JAVA", "j");
		Predicate<String> fun4 = x -> x.startsWith("s") || x.startsWith("S");
		nameList = nameList.stream().filter(fun4.negate()).collect(Collectors.toList());
		System.out.println(nameList);
	}
}
