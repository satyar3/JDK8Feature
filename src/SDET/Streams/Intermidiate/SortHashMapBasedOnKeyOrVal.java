package SDET.Streams.Intermidiate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapBasedOnKeyOrVal
{
	public static void main(String[] args)
	{
		 HashMap<String,Integer> m1 = new HashMap<>();
	        m1.put("D",4);
	        m1.put("C",3);
	        m1.put("A",1);
	        m1.put("B",3);

	        List<Map.Entry<String, Integer>> collect = m1.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
	        System.out.println(collect);

	        for(int i = 0; i<collect.size();i++){
	            System.out.println(collect.get(i).getKey());
	            System.out.println(collect.get(i).getValue());
	        }
	}
}
