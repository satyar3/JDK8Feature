package Practice.three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

public class ArrayAsList
{
	public static void main(String[] args)
	{
		String colType = "General";		
		String colName = "Origin IATA";
		
		
		
		String[] colTypeArr = colType.split(" ");
		colTypeArr[0] = colTypeArr[0].toLowerCase();
		String updatedColType = Arrays.stream(colTypeArr).reduce((x,y) -> (x+y)).orElse("");


		String[] colNameArr = colName.split(" ");
		IntStream.range(0, colNameArr.length).forEach(i -> colNameArr[i] = StringUtils.capitalize(colNameArr[i].toLowerCase()));
		String updatedColName = Arrays.asList(colNameArr).stream().reduce((x,y) -> (x+y)).orElse("");


		String colPath = "[row-id ='"+updatedColType+""+updatedColName+"'] .form-check >input";
		System.out.println("Checkbox path"+ colPath);
		
		/*List<String> nonPrimaryList = Arrays.asList("FRT", "CAC", "BAG", "BUS", "FUE", "BUS", "TOW", "ICE", "CAT", "LCT", "FUE", "PRI", "CLN", "FUE", "PUB").stream().filter(x -> !x.equals("PRI")).collect(Collectors.toList());
		IntStream.range(0,nonPrimaryList.size()).forEach(i -> System.out.println(nonPrimaryList.get(i)));*/
	}
}
