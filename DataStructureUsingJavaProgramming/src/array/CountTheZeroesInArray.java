package array;

import java.util.Scanner;

public class CountTheZeroesInArray {
	public static int CountZeroes(int[]array,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Total number of Zeroes in given array=: "+CountZeroes(array,n));

	}

}
