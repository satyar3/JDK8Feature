package SDET.Collections.Relationship.HASA;

public class Clock implements Alarm
{

	@Override
	public void alarmRing()
	{
		System.out.println("alarmRing Clock");
	}
}
