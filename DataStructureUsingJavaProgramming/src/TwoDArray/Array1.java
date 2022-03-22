package TwoDArray;

import java.util.Scanner;

public class Array1 {

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
		System.out.println("Enter the element to find the location");
		int x=obj.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==x)
				{
					System.out.println("Element is present at " +i+" row "+"and at "+j+" column");
				}
			}
		}

	}

}
