package array;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
	public static int closest3Sum(int A[], int N, int X)
    {
        // code here
        Arrays.sort( A );
    int closest = (int)9E8;
    for (int i=0; i < N; i++)
    {
        int left = i+1, right = N-1;
        while (left < right)
        {
            int currSUM = A[i]+A[left]+A[right];
            if (Math.abs(X - currSUM) < Math.abs(X - closest))
                closest = currSUM;  /** Found a closer 3sum **/
            if      (currSUM < X)   left++;
            else if (X < currSUM)   right--;
            else /** currCUM == X (closest possible 3sum) **/
                return X;
        }
    }
    return closest;
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
		System.out.println("Enter the value of k");
		int k=obj.nextInt();
		System.out.println(closest3Sum(array,size,k));
	}

}
