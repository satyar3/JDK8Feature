package SDET.Consumer;

import java.util.function.Consumer;

public class ConsumerExample
{
	public static void main(String[] args)
	{
		Consumer<String> con = x -> System.out.println(x);
		con.accept("Hello");
		
		Consumer<String> con2 = System.out::println;
		con2.accept("Hello");
	}
}
