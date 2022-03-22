package array;

import java.util.Arrays;
import java.util.Scanner;

public class KeyPairProblemInArray {
	public static boolean hasArrayTwoCandidates(int[]array,int n,int x)
	{
		Arrays.sort(array);
		int num1=0;
		int num2=n-1;
		while(num1<num2)
		{
			if(array[num1]+array[num2]<x)
			{
				num1++;
			}
			else if(array[num1]+array[num2]>x)
			{
				num2--;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int n=obj.nextInt();
		System.out.println("Enter the value of X");
		int x=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		
		System.out.println(hasArrayTwoCandidates(array,n,x));
	}

}
