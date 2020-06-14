package SDET.InterfaceConcept;

public class ImplParentInterface implements ParentInterface
{

	@Override
	public void print(String s)
	{
		System.out.print(s);	
		ParentInterface.helloPrint();
	}
}

class Runner
{
	public static void main(String[] args)
	{
		ImplParentInterface i = new ImplParentInterface();
		i.println("Hello");		
	}
}
