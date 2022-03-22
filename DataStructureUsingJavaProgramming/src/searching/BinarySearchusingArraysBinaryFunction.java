package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchusingArraysBinaryFunction {

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
		int result = Arrays.binarySearch(array,k);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

	}

}
