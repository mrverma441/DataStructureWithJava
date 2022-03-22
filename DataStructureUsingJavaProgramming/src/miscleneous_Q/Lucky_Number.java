package miscleneous_Q;

import java.util.Scanner;

public class Lucky_Number {

	public static void LuckyNumber(int num)
	{
		int count=0;
		int rem;
		int sum=0;
		int num2=num;
		while(num2!=0)
		{
			num2/=10;
			count++;
		}
		num2=num;
		if(count%2==0)
		{
			while(num2!=0)
			{
				rem=num2%10;
				sum+=rem*rem;
				num2=num2/100;

			}
		}
		else
		{
			num2=num2/10;
			while(num2!=0)
			{
				rem=num2%10;
				sum+=rem*rem;
				num2=num2/10;

			}

		}
		if(sum%9==0)
		{
			System.out.println("Its a lucky number");
		}
		else
		{
			System.out.println("Its not a lucky number");
		}
	}
	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=obj.nextInt();
		LuckyNumber(num);
	}

}
