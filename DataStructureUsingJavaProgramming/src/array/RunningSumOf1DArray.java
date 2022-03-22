package array;

import java.util.Scanner;

public class RunningSumOf1DArray {
	public static int[] runningsum(int[]array)
	{
		int i=1;
		while(i<array.length)
		{
			array[i]+=array[i-1];
			i++;
		}
		return array;
	}
	public static void printarray(int[]array,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]+" ");
			
		}
	}
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
	runningsum(array);
	printarray(array,4);
	
	}

}
