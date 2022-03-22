package practice;

import java.util.Scanner;

public class AscDesc {
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
	
		int []array=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<size;i++)
		{
			array[i]=obj.nextInt();
		}
		boolean order=true;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				order=false;
			}
			
		
		}
		if(order)
		{
			System.out.println("Array is in the ascending form");
		}
		else
		{
			System.out.println("Array is in the descending form");
		}
		
		
		
		
    }

}
