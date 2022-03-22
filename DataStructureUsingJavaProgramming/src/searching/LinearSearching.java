package searching;

import java.util.Scanner;

public class LinearSearching {
	public static int Searching(int[]array,int size,int k)
	{
		for(int i=0;i<size;i++)
		{
			if(array[i]==k)
			{
				return i;
			}
		}
		return -1;
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
		System.out.println("Enter the element you want to search");
		int k=obj.nextInt();
		System.out.println("Element "+k+" is located at index "+Searching(array,size,k));
	}

}
