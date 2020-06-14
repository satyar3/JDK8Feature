package SDET.FuntionalInterfaceAndParameter;

public class ImplFunctionalInterface
{
	public static void main(String[] args)
	{
		
		// Function as first object
		FunctionInterface f = x -> x.toUpperCase();
		System.out.println(f.fun("Hello"));
		
		
		print(f);		
		//Passing function as parameter --> Higher order function
		print( x -> x.toLowerCase() + " Test");
	}
	
	static void print(FunctionInterface f)
	{
		System.out.println(f.fun("Name"));
	}
}
