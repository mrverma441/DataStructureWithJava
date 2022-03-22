package array;

import java.util.Scanner;

public class ContainerWithMostWateroptimizesolution {

public static int maxArea(int[] arr) {
        
        int maxArea = 0;
        int i = 0,j = arr.length-1;
        
        while(i < j)
        {
            maxArea = Math.max(maxArea,Math.min(arr[i],arr[j])*(j-i));
            if(arr[i] < arr[j])
            {
                i++;
            }
            
            else
            {
                j--;
            }
        }
        
        return maxArea;

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

		System.out.println(maxArea(array));
	}

}
