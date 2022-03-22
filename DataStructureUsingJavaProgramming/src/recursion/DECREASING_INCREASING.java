package recursion;

import java.util.Scanner;

public class DECREASING_INCREASING {
	public static void DN(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		DN(n-1);
		System.out.println(n);

		
		
	}
	public static void main(String[]args)
	{
		Scanner obj= new Scanner(System.in);
		int n=obj.nextInt();
		DN(n);
	}

}
