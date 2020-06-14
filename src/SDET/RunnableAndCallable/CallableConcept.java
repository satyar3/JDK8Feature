package SDET.RunnableAndCallable;

import java.util.concurrent.Callable;

public class CallableConcept
{
	public static void main(String[] args) throws Exception
	{
		
		//This looks similar to supplier but can't be replaced as suuplier
		
		Callable<Double> callable = () -> Math.random();		
		callable.call();
	}
}
