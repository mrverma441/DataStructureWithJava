package array;

import java.util.Scanner;

public class ContainerWithMostWater {
public static int maxArea(int[] height) {
        
        int maxArea = 0;
        int n=height.length-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                maxArea = Math.max(maxArea,Math.min(height[i],height[j])*(j-i));

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
