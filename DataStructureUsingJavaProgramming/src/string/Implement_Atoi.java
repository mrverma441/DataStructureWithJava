package string;

import java.util.Scanner;

public class Implement_Atoi {
	public static int Atoi(String str)
	{
		try
		{
			return Integer.parseInt(str);
			
		}
		catch(Exception e)
		{
			return -1;
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=obj1.next();
		System.out.println(Atoi(str));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
