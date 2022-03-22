package miscleneous_Q;

import java.util.Scanner;

public class ArmStrong2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=obj.nextInt();
		int num2,rem,res=0,count=0;
		num2=num;
		while(num2!=0)
		{
			num2/=10;
			count++;
		}
		num2=num;
			
		
		while(num2!=0)
		{
			rem=num2%10;
			res+=Math.pow(rem, count);
			num2=num2/10;
			
		}
		if(res==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not");
		}

	}

}
