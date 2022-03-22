package array;

import java.util.Scanner;

public class RotateAnImage {

	public static void rotate(int r,int c,int array[][])
	{
		for(int j=0;j<c;j++)
		{
			for(int i=r-1;i>=0;i--)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int r=obj.nextInt();
		int c=obj.nextInt();
		int[][] arr=new int [r][c];
		System.out.println("Enter the elements in 2-D array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		rotate(r,c,arr);
		
	}

}
