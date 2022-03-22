package array;

import java.util.Scanner;

public class FindTransitionPoint {

	public static int TransitionPoint(int[]array,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(array[i]==i)
			{
				return i;
			}
		}
		return -1;
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
		System.out.println(TransitionPoint(array,n));
				 
		

	}

}
