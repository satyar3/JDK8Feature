package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterfaceConcept
{

	public static void main(String[] args)
	{
		//It doesn't take any argument but returns one type		
		getText( () -> "Test");
		getText( () -> "Hello");
	}

	public static void getText(Supplier<String> s)
	{
		System.out.println(s.get());
	}
}
