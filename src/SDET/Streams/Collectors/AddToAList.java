package SDET.Streams.Collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToAList
{
	public static void main(String[] args)
	{
		List<Integer> listInt = new ArrayList<>();
		
		Collections.addAll(listInt, 1,2,3,4,5,6,7,8);

	}
}
