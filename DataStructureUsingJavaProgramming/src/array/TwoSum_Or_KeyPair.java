package array;

import java.util.Scanner;

public class TwoSum_Or_KeyPair {
	public static boolean twosum(int[]array,int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==x)
				{
					return true;
				}
			}
		}
		return false;
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
		System.out.println("Enter the target value");
		int x=obj.nextInt();
		System.out.println(twosum(array,n,x));

	}

}
