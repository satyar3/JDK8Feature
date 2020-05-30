package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept
{
	public static void main(String[] args)
	{
		// It's a functional interface
		// It takes an argument and returns nothing
		// one method is present which is accept
		
		Consumer<String> fun1 = x -> System.out.println(x.concat(" world"));
		fun1.accept("Hello");
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		numList.forEach(x -> System.out.println(x));
	}
}
