package array;

import java.util.Scanner;

public class SquaresOfSortedArray {
	public static int[] squaresofsortedarray(int[]array)
	{
		int[]sqr=new int[array.length];
		int low=0;
		int high=array.length-1;
		int index=high;
		while(low<=high)
		{
			if(Math.abs(array[low])>Math.abs(array[high]))
			{
				sqr[index]=array[low]*array[low];
				index--;
				low++;
			}
			else
			{
				sqr[index]=array[high]*array[high];
				index--;
				high--;
			}
		}
		return sqr;
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
		int ans[]=squaresofsortedarray(array);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	
	}

}
