package array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
	public static int  KthSmallest(int[]array,int k)
	{
		Arrays.sort(array);//Sort the Array First
		
		return array[k-1];//Return Kth Element after the sorting
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
		System.out.println("give the value of k");
		int k=obj.nextInt();
		System.out.println("Kth Smallest Element is "+KthSmallest(array,k));
		

	}

}
