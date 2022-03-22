package array;
import java.util.Scanner;
public class ProductOfArrayExceptItself {
	public static void product(int[]array,int n)
	{
		int[]store=new int[n];
		int product=1;
		for(int i=0;i<n;i++)
		{
			product=product*array[i];
		}
		for(int i=0;i<n;i++)
		{
			store[i]=product/array[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(store[i]+" ");
		}
	}

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter elements of the array");
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		product(array,n);
	}

}
