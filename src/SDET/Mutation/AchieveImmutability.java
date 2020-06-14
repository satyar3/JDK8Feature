package SDET.Mutation;

import java.util.Arrays;

public class AchieveImmutability
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3};
		
		System.out.println(Arrays.toString(arr));
		print(arr);
		printFunctional(arr);
	}
	
	//Mutation concept is defied
	public static void print(int[] arr)
	{
		arr[0]++;
		arr[1]++;
		arr[2]++;
		
		System.out.println(Arrays.toString(arr));
	}
	
	//Use functional programming to achieve mutation
	public static void printFunctional(int[] arr)
	{
		int[] arrN = Arrays.copyOf(arr, arr.length);
		arrN[0]++;
		arrN[1]++;
		arrN[2]++;
		
		System.out.println(Arrays.toString(arr));
	}
}
