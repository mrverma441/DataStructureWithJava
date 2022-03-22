package practice;

public class StackHeight {
	public static int cp(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		int xpow=x*cp(x,n-1);
		return xpow;
		
		
	}

	public static void main(String[] args) {
		int n=3,x=4;
		System.out.println(cp(x,n));

	}

}
