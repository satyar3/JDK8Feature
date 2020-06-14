package SDET.Streams.Terminal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinOrMaxUsingComparator
{
	public static void main(String[] args)
	{
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(1);
		intList.add(9);
		intList.add(2);
		
		Optional<Integer> opt = intList.stream().max(Comparator.naturalOrder());
		
		/*Optional<Integer> opt = Optional.ofNullable(null);
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("Not Present");*/
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("Not Present");
	}
}
