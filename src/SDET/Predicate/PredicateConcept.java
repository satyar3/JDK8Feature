package SDET.Predicate;

import java.util.function.Predicate;

public class PredicateConcept
{
	public static void main(String[] args)
	{
		Predicate<Integer> pred1 = n -> n>2;
		System.out.println(pred1.test(5));
		
		Predicate<Integer> pred2 = n -> n<3;
		
		
		// Predicate Chaining		
		System.out.println(pred1.and(pred2).test(6));
		
		
	}
}
