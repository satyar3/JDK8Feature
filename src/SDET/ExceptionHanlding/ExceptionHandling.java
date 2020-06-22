package SDET.ExceptionHanlding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling
{
	public static void main(String[] args)
	{	
		List<String> integers = Arrays.asList("44", "373", "xyz", "145");
		
		//Unchecked Exception example
		integers.forEach(
		        handledConsumer(str -> System.out.println(Integer.parseInt(str)), 
		        NumberFormatException.class));	
		
		
		//Checked Exception example
		List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
		list.forEach(HandlingConsumer.handlingConsumerBuilder(i->Thread.sleep(i)));
		
	}
	
	//Unchecked Exception
	static <Target, ExObj extends Exception> Consumer<Target> handledConsumer(Consumer<Target> targetConsumer, Class<ExObj> exceptionClazz) {
		return obj -> {
			try
			{
				targetConsumer.accept(obj);
			} 
			catch (Exception ex)
			{
				try
				{
					ExObj exCast = exceptionClazz.cast(ex);
					System.err.println("Exception occured : " + exCast.getMessage());
				} 
				catch (ClassCastException ccEx)
				{
					throw ex;
				}
			}
		};
	}
	

}

//Checked Exception
@FunctionalInterface
interface HandlingConsumer<Target, ExObj extends Exception> {
    
	void accept(Target target) throws ExObj;    

    static <Target> Consumer<Target> handlingConsumerBuilder(HandlingConsumer<Target, Exception> handlingConsumer) {
		return obj -> {
			try
			{
				handlingConsumer.accept(obj);
			} 
			catch (Exception ex)
			{
				throw new RuntimeException(ex);
			}
		};
    }
}
