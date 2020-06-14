package SDET.Supplier;

import java.util.function.Supplier;

public class SupplierExample
{
	public static void main(String[] args)
	{
		Supplier<String> sup1 = () -> "Hello";		
		System.out.println(sup1.get());
		
		Supplier<Double> sup2 = Math::random;		
		System.out.println(sup2.get());
	}
}
