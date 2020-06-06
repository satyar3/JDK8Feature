package Reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceConcept
{
	public static void main(String[] args)
	{
		List<String> products = new ArrayList<>();
		products.add("one");
		products.add("two");
		products.add("three");
		
		String productInString = products.stream().map(text -> text).reduce((id1, id2) -> id1+id2).orElse("");
		
		System.out.println(productInString);
	}
}
