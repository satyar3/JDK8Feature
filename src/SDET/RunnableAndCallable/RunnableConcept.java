package SDET.RunnableAndCallable;

public class RunnableConcept
{
	public static void main(String[] args)
	{
		Runnable r = () -> System.out.println("Hello");
		r.run();
		
		
		Runnable r2 = () -> System.out.println("Hello World");
		Thread t = new Thread(r2);
		
		t.start();
	}
}
