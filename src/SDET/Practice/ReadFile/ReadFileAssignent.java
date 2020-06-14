package SDET.Practice.ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadFileAssignent
{
	public static void main(String[] args) throws IOException
	{
		
		Path path = Paths.get("src/SDET/Practice/ReadFile/NameFile.txt");
		List<String> fileLines = Files.readAllLines(path);
		
		//Task - 1 --> Print all the names starting with B
		//fileLines.stream().filter(name -> name.toLowerCase().startsWith("b")).forEach(System.out::println);
		
		//Task - 2 --> Create a list which starts with C and conatins s in it
		/*List<String> filteredNameList = fileLines.stream()
			.filter(name -> name.startsWith("C"))
			.filter(name -> name.toLowerCase().contains("s"))
			.collect(Collectors.toList());*/
		
		// Task - 3 --> Count the total number of characters for all the names starts with M/m
		
		// way-1
		/*int totalCharacters = fileLines.stream()
			.filter(name -> name.toLowerCase().startsWith("m"))
			.collect(Collectors.joining()).length();		
		System.out.println(totalCharacters);*/
		
		//way-2
		/*int totallength = fileLines.stream()
			.filter(name -> name.toLowerCase().trim().startsWith("m"))
			.map(name -> name.length())
			.mapToInt(nameInt -> nameInt)
			.sum();
		System.out.println(totallength);*/
		
		//Task - 4 --> find the names containing "-" and replace it with a space ; collect it into a list
	/*	List<String> nameList = fileLines.stream()
			.filter(name -> name.contains("-"))
			.map(name -> name.replaceAll("-", " "))
			.collect(Collectors.toList());
		
		System.out.println(nameList);*/
		
		//Task - 5 --> find the name which is having more number of characters
		// way-1
		/*Function<String, Integer> fun = name -> name.length();
		Map<Integer, List<String>> nameGroup = fileLines.stream()
			.collect(Collectors.groupingBy(fun));
		
		int maxLengthKey = nameGroup.keySet().stream().mapToInt(x -> x).max().getAsInt();		
		System.out.println(nameGroup.get(maxLengthKey));*/
		
		//way-2
		System.out.println(		
		fileLines.stream()
			.max(Comparator.comparing(name -> name.length())).get()		
		);
		
	}
}
