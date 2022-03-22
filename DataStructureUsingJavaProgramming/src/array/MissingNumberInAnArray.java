package array;

import java.util.Scanner;

public class MissingNumberInAnArray {
	public static int  MissingNumber(int[]array,int n)
	{
		int totalsum=n*(n+1)/2;
		int sumofarray=0;
		for(int i=0;i<n;i++)
		{
			sumofarray+=array[i];
		}
		return totalsum-sumofarray;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[size];
		for(int i=0;i<size-1;i++)
		{
			array[i]=obj.nextInt();
		}
		int ans=MissingNumber(array,size);
		System.out.println("Missing number is "+ans);
	}

}
