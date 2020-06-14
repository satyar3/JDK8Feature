package SDET.Practice.Calculator.Way2;

import java.util.HashMap;

import SDET.Practice.Calculator.Way1.MathOperation;

public class CalculatorClass
{
	private static HashMap<String, MathOperation> operationMap = new HashMap<>();
	
	private static MathOperation add = (x, y) -> x + y;
	private static MathOperation sub = (x, y) -> x - y;
	private static MathOperation mul = (x, y) -> x * y;
	private static MathOperation div = (x, y) -> x / y;
	
	static
	{
		operationMap.put("+", add);
		operationMap.put("-", sub);
		operationMap.put("*", mul);
		operationMap.put("/", div);
	}
	
	
	public static void addOperation(String expression, MathOperation operation)
	{
		operationMap.put(expression, operation);
	}
	
	public static int operateOnInput(MathOperation action, int onscreenNumber, int enteredNumber)
	{
		return action.operate(onscreenNumber, enteredNumber);
	}
	
	public static int calculate(String exp)
	{
		String[] arrExp = exp.split(" ");
		int onScreenNumber = Integer.parseInt(arrExp[0]);		
		
		for(int i = 0; i<arrExp.length-2; i=i+2)
		{
			onScreenNumber = operateOnInput(operationMap.get(arrExp[i+1]), onScreenNumber, Integer.parseInt(arrExp[i+2]));
		}
		
		return onScreenNumber;		
	}
	
	public static void main(String[] args)
	{
		int result = calculate("5 + 2 - 3 * 7 + 2 / 6 - 1 * 30");
		System.out.println("Result : "+result);

	}
}
