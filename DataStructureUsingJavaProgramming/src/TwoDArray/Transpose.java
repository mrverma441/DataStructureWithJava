package TwoDArray;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int i,j;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the rows and cols");
		int row=obj.nextInt();
		int col=obj.nextInt();
		int[][]array=new int[row][col];
		System.out.println("Enter the elements in matrix form");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				array[i][j]=obj.nextInt();
			}
		}
		System.out.println("The Transpose of the matrix is ");
		
		for(j=0;j<col;j++)
		{
			for(i=0;i<row;i++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}
