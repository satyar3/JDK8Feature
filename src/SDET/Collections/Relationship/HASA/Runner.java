package SDET.Collections.Relationship.HASA;

import java.util.ArrayList;
import java.util.List;

public class Runner
{
	public static void main(String[] args)
	{
		Alarm phone = new Phone();
		phone.alarmRing();
		
		Alarm clock = new Clock();
		clock.alarmRing();
		
		
		List<Alarm> listAnimal = new ArrayList<>();
		listAnimal.add(phone);
		listAnimal.add(clock);
	}
}
