package Practice;

import java.util.Arrays;

public class MethodReference
{
	public static void main(String[] args)
	{
		MethodReference m = new MethodReference();
		
		Arrays.asList("A","b","c","d").forEach(m::print);
	}
	
	public void print(String s)
	{
		System.out.println("Printing : "+s);
	}
}
