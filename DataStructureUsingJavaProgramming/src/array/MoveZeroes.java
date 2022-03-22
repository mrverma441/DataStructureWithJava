package array;

import java.util.Scanner;

public class MoveZeroes {
	public static void movezeroes(int[]array)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				array[count++]=array[i];
			}
		}
		for(int i=count;i<array.length;i++)
		{
			array[i]=0;
		}
		
	}
public static void printarray(int[]array)
{
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]+" ");
	}
}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		movezeroes(array);
		printarray(array);
	}

}
