package array;

import java.util.Scanner;

public class ReplaceAll0sWith5 {
public static int Replace(int num)
{
	String str=String.valueOf(num);
	String new_String="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='0')
		{
			new_String+='5';
		}
		else
		{
			new_String+=str.charAt(i);
		}
	}
	return Integer.parseInt(new_String);
}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=obj.nextInt();
		System.out.println("After replacing all the 0's with 5 new String is "+Replace(num));

	}

}
