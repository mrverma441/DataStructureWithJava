package array;

import java.util.Scanner;

public class LargestSumContigousArray {
	public static int MaxSubArraySum(int[]array,int size)
	{
		int current_sum=0,maximum_sum=0;
		for(int i=0;i<size;i++)
		{
			current_sum=current_sum+array[i];
			if(current_sum>maximum_sum)
			{
				maximum_sum=current_sum;
			}
			if(current_sum<0)
			{
				current_sum=0;
			}
			
		}
		return maximum_sum;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements in the array");
		int[]array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=obj.nextInt();
		}
		

	}

}
