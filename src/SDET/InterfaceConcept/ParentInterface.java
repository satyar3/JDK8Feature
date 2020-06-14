package SDET.InterfaceConcept;

public interface ParentInterface
{
	void print(String s);
	
	default void println(String s)
	{
		System.out.println(s);
	}
	
	static void helloPrint()
	{
		System.out.println("Hello Print");
	}
}
