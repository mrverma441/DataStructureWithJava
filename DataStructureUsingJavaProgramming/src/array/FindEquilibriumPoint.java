package array;

import java.util.Scanner;

public class FindEquilibriumPoint {
	public static int EquilibriumPoint(long[]array,int n)
	{
		long total_sum=0,current_sum=0;
		for(int i=0;i<n;i++)
		{
			total_sum+=array[i];
		}
		for(int j=0;j<n;j++)
		{
			total_sum=total_sum-array[j];
			if(total_sum==current_sum)
			{
				return j+1;
			}
			else
			{
				current_sum+=array[j];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		long[]array=new long[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println(EquilibriumPoint(array,n));

	}

}
