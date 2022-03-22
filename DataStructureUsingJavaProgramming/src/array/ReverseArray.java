package array;

import java.util.Arrays;

public class ReverseArray {

	public static void reversearray(int[]array)
	{
		System.out.println("Array before reverse is "+Arrays.toString(array));
		int temp;
		for(int i=0;i<array.length/2;i++)
		{
			temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		System.out.println("Array after reverse is "+Arrays.toString(array));
		
	}
	public static void main(String[] args) {
		reversearray(new int[] {4,5,8,9,10});

	}

}
