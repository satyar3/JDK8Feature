package SDET.Streams.Intermidiate;

import java.util.ArrayList;
import java.util.List;

public class FlatMapConcept
{
	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		
		List<List<Integer>> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		list.stream().flatMap(l -> l.stream()).forEach(System.out::println);
	}
}
