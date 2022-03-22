package miscleneous_Q;

import java.util.Scanner;

public class Reverse_A_Number {
	public static int reverse(int num)
	{
		int num2=num;
		int rem;
		int rev=0;
		while(num2!=0)
		{
			rem=num2%10;
			rev=rev*10+rem;
			num2=num2/10;
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to find its reverse");
		int num=obj.nextInt();
		System.out.println(reverse(num));

	}

}
