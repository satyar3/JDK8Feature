package Practice.two;

public class Runner
{
	public static void main(String[] args)
	{
		MathOperation add = (x,y) -> x+y;
		MathOperation subtract = (x,y) -> x-y;
		MathOperation multiply = (x,y) -> x*y;
		MathOperation divide = (x,y) -> x/y;
		
		operateOnInput(add,10,5);
		operateOnInput(subtract,10,5);
		operateOnInput(multiply,10,5);
		operateOnInput(divide,10,5);
	}	
	
	public static void operateOnInput(MathOperation action, int onscreenNumber, int enteredNumber)
	{
		System.out.println(action.operate(onscreenNumber, enteredNumber));
	}
}
