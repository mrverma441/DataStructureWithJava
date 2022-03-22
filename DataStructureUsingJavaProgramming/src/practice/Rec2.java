package practice;

public class Rec2 {
	public static void  printnum(int n)
	{
		if(n==11)
		{
			return;
		}
		System.out.print(n+" ");
		printnum(n+1);
		
	}

	public static void main(String[] args) {

		int n=1;
		printnum(n);
	}

}
