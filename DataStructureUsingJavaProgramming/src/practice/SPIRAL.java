package practice;

import java.util.Scanner;

public class SPIRAL {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Rows and cols");
		int n=obj.nextInt();
		int m=obj.nextInt();
		int[][]array=new int[n][m];
		System.out.println("Enter the elements in the matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array[i][j]=obj.nextInt();
			}
		}
		System.out.println("The Spiral model is");
		int l=0,r=m-1;
		int t=0,b=n-1;
		int d=0;
		while(l<=r&&t<=b)
		{
			if(d==0)
			{
				for(int i=l;i<=r;i++)
				{
					System.out.print(array[t][i]+"-> ");
				}
				d=1;
				t++;
				
			}
			else if(d==1)
			{
				for(int i=t;i<=b;i++)
				{
					System.out.print(array[i][r]+"-> ");
				}
				d=2;
				r--;
			}
			else if(d==2)
			{
				for(int i=r;i>=l;i--)
				{
					System.out.print(array[b][i]+"-> ");
				}
				d=3;
				b--;
			}
			else if(d==3)
			{
				for(int i=b;i>=t;i--)
				{
					System.out.print(array[i][l]+"-> ");
				}
				l++;
			}
		}
	
		
		
		

	}

}
