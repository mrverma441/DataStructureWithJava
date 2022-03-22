package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayConsistingOf012UsingArraySort {
	public static void Sort(int[]array)
	{
		Arrays.sort(array);
	}

	public static void printarray(int[]array,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements in the array");
		int[]array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=obj.nextInt();
		}
	
		Sort(array);
		printarray(array,size);		
		

	}

}
