package miscleneous_Q;

import java.util.Scanner;

public class Palindrome_Number {
	public static void Palindrome(int num)
	{
		int num2=num,rem,rev=0;
		
		while(num2!=0)
		{
			rem=num2%10;
			rev=rev*10+rem;
			num2=num2/10;
			
		}
		if(num==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=obj.nextInt();
		Palindrome(num);
	}

}
