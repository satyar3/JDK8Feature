package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorIntefaceConcept
{
	public static void main(String[] args)
	{
		/**
		 * Represents an operation on a single operand that produces a result of the 
		 * same type as its operand. This is a specialization of Function for the case 
		 * where the operand and result are of the same type.
		 * 
		 */
		
		// It extends Function Interface
			
		UnaryOperator<String> fun = x -> x.toUpperCase();
		String newString = fun.apply("hello world");
		System.out.println(newString);
		
		//using FunctionInterface
		
		Function<String, String> fun2 = y1 -> y1.toLowerCase();
		String newStringUsingFunction = fun.andThen(fun2).apply(newString);
		System.out.println(newStringUsingFunction);
		
		
		List<String> arrList = new ArrayList<>();
		arrList.add("one");
		arrList.add("two");
		arrList.add("three");
		
		arrList.replaceAll(ele -> ele+" Satya");
		
		System.out.println(arrList);
	}
}
