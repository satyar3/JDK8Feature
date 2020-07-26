package SDET.Supplier;

import java.util.HashMap;
import java.util.function.Supplier;

public class NullSupplier
{
	public static void main(String[] args)
	{
		Supplier<Test> nullSupplier = () -> null;
		Supplier<Test> objSupplier = () -> new Test();
		
		System.out.println(nullSupplier.get());
		System.out.println(objSupplier.get());
		
		HashMap<String, Supplier<Test>> testMap = new HashMap<>();
		testMap.put(null, nullSupplier);
		testMap.put("objSupplier", objSupplier);
		
		System.out.println(testMap.get(null));
	}
}

class Test
{
	Test()
	{
		System.out.println("Test Obj Created");
	}
}