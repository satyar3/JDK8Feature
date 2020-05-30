package FlatMap;

import java.util.HashSet;
import java.util.Set;

public class Customer
{
	private String name;
	private Set<String> device;
	
		
	public void addDevice(String deviceName)
	{
		if(this.device == null)
			this.device = new HashSet<>();
		
		this.device.add(deviceName);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<String> getDevice()
	{
		return device;
	}

	public void setDevice(Set<String> device)
	{
		this.device = device;
	}
}
