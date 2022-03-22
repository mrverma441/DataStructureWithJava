package array;

import java.util.Scanner;

public class RemoveDuplicateElementFromSortedArray {
	public static int Remove(int A[],int N)
	{
		int j=0;
		for(int i=0;i<N;i++)
		{
			if(i<N-1&&A[i]==A[i+1])
			{
				continue;
			}
			else
			{
				A[j]=A[i];
				j++;
			}
		}
		return j;

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
		System.out.println(Remove(array,n));
	}

}
