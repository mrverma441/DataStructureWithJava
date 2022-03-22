package array;

import java.util.Scanner;

public class CounInversionOfAnArray {
	public static int Count(int[]array,int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=obj.nextInt();
		}
		int ans=Count(array,size);
		System.out.println(ans);
	}

}
