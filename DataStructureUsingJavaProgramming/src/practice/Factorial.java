package practice;

public class Factorial {
	public static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		int fact=n*factorial(n-1);
		return fact;
	}

	public static void main(String[] args) {
		int n=6;
		System.out.println(factorial(n));
		

	}

}
