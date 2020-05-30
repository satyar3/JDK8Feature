package LamndaExpressionAndMethodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamndaExpressionAndMethodRef
{

	public static void main(String[] args)
	{
		
		List<String> names = Arrays.asList("Test1", "Test2", "Test3", "Test4");
		
		//Using anonymous inner class
		names.forEach(new Consumer<String>()
		{
			@Override
			public void accept(String t)
			{
				System.out.println(t);				
			}
			
		});
		
		
		//Using Lambdaexpression
		
		//Consumer<String> con =  x -> System.out.println(x.length());
		//names.forEach(con);
		names.forEach(x -> System.out.println(x.length()));
		
		//Method References
		names.forEach(System.out::println);
		
		
	}

}
