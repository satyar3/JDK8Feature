package FunctionalInterface;

import java.util.function.Function;

public class FunctioInterfaceConcept
{
	public static void main(String[] args)
	{
		
		//Refer the URL : devdocs.io
		
		// 1- Functional interface takes two argument says T and R
		// 2 - T --> take the input
		// 3 - R --> return the output
		// It has only method which is apply
		
		Function<String, Integer> fun = x -> x.length();
		Integer op = fun.apply("Hello world");
		System.out.println(op);
				
		
		//Chaining function
		// Here take the output of one function and then apply it with another function
		
		
		Function<Integer, Integer> fun2 = x -> x * 2;
		
		Integer chain1 = fun.andThen(fun2).apply("Hello Java world");
		
		System.out.println(chain1);
		
	}
}
