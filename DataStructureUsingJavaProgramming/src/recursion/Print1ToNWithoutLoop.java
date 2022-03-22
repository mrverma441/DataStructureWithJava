package recursion;

public class Print1ToNWithoutLoop {

	public static void print(int N)
	{
		if(N<=0)
		{
			return;
		}
		print(N-1);
		System.out.print(N+" ");
	}
	public static void main(String[] args) {
		int N=10;
		print(N);

	}

}
