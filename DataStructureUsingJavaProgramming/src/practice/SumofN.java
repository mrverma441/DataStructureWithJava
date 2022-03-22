package practice;

public class SumofN {
	public static void sumofn(int i,int n,int sum)
	{
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		sumofn(i+1,n,sum);
		
	}

	public static void main(String[] args) {
		int n=10;
		sumofn(0,n,0);

	}

}
