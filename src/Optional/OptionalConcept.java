package Optional;

import java.util.Optional;

public class OptionalConcept
{
	public static void main(String[] args)
	{
		//Create optional ref
		Optional<String> optionRef = Optional.empty();		
		
		//Create ref for which you want to check optional
		String book = null;
		
		//OfNullable Returns an Optional describing the specified value, if non-null,otherwise returns an empty Optional.
		optionRef = Optional.ofNullable(book);	
		
		//isPresent() returns true if value is not null
		if(optionRef.isPresent())
			System.out.println(optionRef.get());
		else
			System.out.println(optionRef);
		
		
		//Of() Returns an Optional with the specified present non-null value and if it's null it'll throw nullpointer exception
		/*		
		optionRef = Optional.of(book);
		if(optionRef.isPresent())
			System.out.println(optionRef.get());		
		*/
		
		// Set value using orElse() --> If the ref is null then set he value	and assign it to the ref
		// By using this we reduced much line of code and handeled nullpointer exception
		String language = null;
		language = optionRef.ofNullable(language).orElse("String has been assigned");
		System.out.println(language);
		
	}
}