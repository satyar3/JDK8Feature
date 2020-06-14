package SDET.FuntionalInterfaceAndParameter;

public class OrderOfExecution
{
	public static void main(String[] args)
	{
		testOrder(x -> {
			System.out.println("inside lambda");
			return x.toUpperCase();
		});
	}
	
	public static void testOrder(FunctionInterface f)
	{
		System.out.println("Inside static function");
		String s = f.fun("test");
		System.out.println(s);
	}
}
