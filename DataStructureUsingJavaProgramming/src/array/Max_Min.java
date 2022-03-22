package array;

import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		int min=arr[0];
		int max=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum:= "+max);
		System.out.println("Minimum:= "+min);


	}

}
