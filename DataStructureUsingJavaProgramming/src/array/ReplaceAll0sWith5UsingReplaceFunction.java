package array;
import java.util.Scanner;
public class ReplaceAll0sWith5UsingReplaceFunction {
	public static int Replace(int num)
	{
		String str=String.valueOf(num);
		String result=str.replace('0', '5');
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=obj.nextInt();
		System.out.println(Replace(num));
		

	}

}
