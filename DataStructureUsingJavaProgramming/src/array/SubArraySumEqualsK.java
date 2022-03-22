package array;

import java.util.Scanner;

public class SubArraySumEqualsK {
	public static int SubArraySumEquals(int[]array,int k)
	{
		int n=array.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			int sum=array[i];
			if(sum==k)
			{
				count++;
			}
			for(int j=i+1;j<n;j++)
			{
				sum+=array[i];
				if(sum==k)
				{
					count++;
				}
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements in the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=obj.nextInt();
		System.out.println("value of count is: "+SubArraySumEquals(array,k));
		

	}

}
