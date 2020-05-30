package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept
{
	public static void main(String[] args)
	{
		
		
		//This BinaryOperator interface extends BiFunction interface
		// It takes two arguments of same type and returns the output of the same type
		
		
		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		System.out.println(func.apply(6, 7));
		
		
		// Using Bifunction interface
		// It takes 3 arguments
		// All arguments must be of same types
		
		BiFunction<Integer, Integer, Integer> fun2 = (y1 , y2) -> y1*y2;
		Integer res = fun2.apply(6, 9);
		System.out.println(res);
	}
}
