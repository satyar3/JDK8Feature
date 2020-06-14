package SDET.Function;

import java.util.function.Function;

public class FunctionConcept
{
	public static void main(String[] args)
	{
		Function<String, Integer> fun1 = x -> x.length();
		Function<Integer, Integer> fun2 = x -> x*x;
		
		fun1.apply("Test");
		
		//Chaining
		fun1.andThen(fun2).apply("hello");
		
		//Compose
		fun2.compose(fun1).apply("test");
		
	}
}
