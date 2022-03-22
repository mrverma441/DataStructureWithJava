package recursion;
//for logn stack height
public class Stackheightlogn {

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
		if(n%2==0)
		{
			return cp(x,n/2)*cp(x,n/2);
		}
		else
		{
			return cp(x,n/2)*cp(x,n/2)*x;

		}
	}
	public static void main(String[] args) {
		int x=2,n=5;
		System.out.print(cp(x,n));

	}

}
