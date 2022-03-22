package searching;

import java.util.Scanner;

public class BinarySearhing {
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }
		      else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
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
		binarySearch(array,0,array.length-1,k);
	}

}
