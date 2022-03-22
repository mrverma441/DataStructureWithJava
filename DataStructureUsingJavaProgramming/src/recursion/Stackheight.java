package recursion;

public class Stackheight {
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

		int x=2,n=5;
		System.out.print(cp(x,n));
	}

}
