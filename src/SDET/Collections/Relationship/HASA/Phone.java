package SDET.Collections.Relationship.HASA;

public class Phone implements Alarm
{

	@Override
	public void alarmRing()
	{
		System.out.println("alarmRing Phone");
	}
}
