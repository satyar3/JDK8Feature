package SDET.Collections.Relationship.ISA;

import java.util.ArrayList;
import java.util.List;

public class Runner
{
	public static void main(String[] args)
	{
		Animal cat = new Cat();
		cat.bark();
		
		Animal dog = new Dog();
		dog.bark();
		
		
		List<Animal> listAnimal = new ArrayList<>();
		listAnimal.add(dog);
		listAnimal.add(cat);
	}
}
