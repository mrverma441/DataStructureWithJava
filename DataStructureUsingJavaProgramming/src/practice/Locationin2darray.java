package practice;

import java.util.Scanner;

public class Locationin2darray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the rows and columns ");
		int r=obj.nextInt();
		int c=obj.nextInt();
		int [][]array=new int[r][c];
		System.out.println("Enter the elements in the array");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[i][j]=obj.nextInt();
				
			}
		}
		System.out.println("Enter the element to find its location");
		int x=obj.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(array[i][j]==x)
				{
					System.out.println("Element is present at "+i+"row & "+j+" column");
				}
			}
			
		}
		
				

	}

}
