package array;

import java.util.Scanner;

public class FibonacciNumber {
	public static int fibonacci(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			int a=1,b=1,c=0;
			for(int i=3;i<=n;i++)
			{
				c=a+b;
				a=b;
				b=c;

			}
					
		return c;
	}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		System.out.println(fibonacci(n));
	}

}
