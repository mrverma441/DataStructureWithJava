package miscleneous_Q;

import java.util.Scanner;

public class Geometric_Sequence {

	public static void main(String[] args) {

		int sum=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(sum);
			sum=sum*2;
		}
	}

}
