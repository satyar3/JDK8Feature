package SDET.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChaining
{
	public static void main(String[] args)
	{
		
		//Consumer chaining is not possible for different types
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Consumer<String> c1 = x -> System.out.println(x.toUpperCase());
		Consumer<String> c2 = x -> System.out.println(x.toLowerCase());
		Consumer<String> c3 = c1.andThen(c2);
		
		list.forEach(c3);
	}
}
