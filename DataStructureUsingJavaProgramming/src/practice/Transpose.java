package practice;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		int rows=obj.nextInt();
		int cols=obj.nextInt();
		int [][]array=new int [rows][cols];
		System.out.println("Enter the elements in the matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array[i][j]=obj.nextInt();
			}
		}
		System.out.println("Transpose of the given matrix is");

		for(int j=0;j<cols;j++)
		{
			for(int i=0;i<rows;i++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
				
		}
	}

}
