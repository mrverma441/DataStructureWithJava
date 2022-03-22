package array;

import java.util.Scanner;

public class SortAnArrayConsistingOf012UsingCountVariable {
	public static void Sort012(int[]array,int size)
	{
		int count0=0,count1=0,count2=0;
		for(int i=0;i<size;i++)
		{
			if(array[i]==0)
			{
				count0++;
				
			}
			else if(array[i]==1)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		for(int i=0;i<count0;i++)
		{
			array[i]=0;
		}
		for(int i=count0;i<count0+count1;i++)
		{
			array[i]=1;
		}
		for(int i=count0+count1;i<size;i++)
		{
			array[i]=2;
		}
	}
	public static void printarray(int[]array,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");

		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements of array");
		int[]array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=obj.nextInt();
		}
		Sort012(array,size);
		printarray(array,size);

	}

}
