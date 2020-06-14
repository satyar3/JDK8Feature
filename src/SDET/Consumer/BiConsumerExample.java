package SDET.Consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample
{
	public static void main(String[] args)
	{
		BiConsumer<String,Integer> biCon = (x,y) -> {
				System.out.println("Name : "+x);
				System.out.println("Age : "+y);
		};
		
		biCon.accept("Satya", 20);
		
	
		//Application of BiConsumer
		
		/*********************************************/
		
		Consumer<String> con = x -> System.out.println(x.toUpperCase());
		
		HashMap<String, Consumer<String>> map = new HashMap<>();
		map.put("one", con);
		
		map.forEach(
				(k,v) -> {
					System.out.println("key is : "+k);
					v.accept("Hello");
				});
		
		
		/*********************************************/
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("one", "con");
		
		map2.forEach(
				
				(k,v) -> {
					System.out.println("key : "+k);
					System.out.println("value : "+v);
				});
		
	}
}
