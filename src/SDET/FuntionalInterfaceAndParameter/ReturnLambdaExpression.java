package SDET.FuntionalInterfaceAndParameter;

public class ReturnLambdaExpression
{
	public static void main(String[] args)
	{
		print(getLambda());
	}
	
	public static FunctionInterface getLambda()
	{
		return x -> x.toUpperCase();
	}
	
	static void print(FunctionInterface f)
	{
		System.out.println(f.fun("Name"));
	}
}
