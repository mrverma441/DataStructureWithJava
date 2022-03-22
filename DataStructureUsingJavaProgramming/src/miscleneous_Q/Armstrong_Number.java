package miscleneous_Q;

import java.util.Scanner;

public class Armstrong_Number {
	public static void Armstrong(int num)
	{
		int num2=num;
		int rem;
		int sum=0;
		while(num2!=0)
		{
			rem=num2%10;
			sum+=(rem*rem*rem);
			num2=num2/10;
		}
		if(sum==num)
		{
			System.out.println("It is an armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
	}

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=obj.nextInt();
		Armstrong(num);
		
	}

}
