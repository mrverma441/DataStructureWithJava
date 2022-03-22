package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ValueEqualToIndexValue {
	static ArrayList<Integer>ValueEqualToIndex(int[]array,int n)
	{
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(i+1);
		}
		return list;
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
		System.out.println(ValueEqualToIndex(array,n));

	}

}
