package array;

import java.util.Scanner;

public class MinimumNumberOfJumps {
	public static int MinimumJumps(int[]array)
	{
		int i=0;
		int n=array.length;
		int hops=0;
		if(n==1)
		{
			return 0;
		}
		while(i<n-1)
		{
			if(array[i]==0)
			{
				return -1;
			}
			int maxInd=i+1;
			if(i+array[i]>=n-1)
			{
				return hops+1;
			}
			for(int j=i+1;j<n&&j<=i+array[i];j++)
			{
				if(array[maxInd]+maxInd<array[j]+j)
				{
					maxInd=j;
				}
			}
			i=maxInd;
			hops++;
		}
		return hops;
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
		System.out.println(MinimumJumps(array));
				

	}

}
