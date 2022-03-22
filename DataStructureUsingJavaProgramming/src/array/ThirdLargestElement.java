package array;
import java.util.Arrays;
import java.util.Scanner;
public class ThirdLargestElement {
	public static int ThirdLargest(int[]array,int n)
	{
		Arrays.sort(array);
		if(n<=2)
		{
			return -1;
		}
		else
		{
			return array[n-3];
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of String");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Third Largest Element in the given array is "+ThirdLargest(array,n));

	}

}
