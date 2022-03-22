package array;
import java.util.Scanner;
public class FindTripletsWithZeroSum {
	public static boolean FindTriplets(int[]array,int n)
	{
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=i+1;k<n;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int [n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println(FindTriplets(array,n));
	}

}
