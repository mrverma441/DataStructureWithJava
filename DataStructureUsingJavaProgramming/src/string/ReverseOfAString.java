package string;

import java.util.Scanner;

public class ReverseOfAString {
	public static String reverse(String str)
	{
		int n=str.length();
		String strres="";
		for(int i=n-1;i>=0;i--)
		{
			strres+=str.charAt(i);
		}
		return strres;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String to find its reverse");
		String str=obj.nextLine();
		System.out.println("Reverse of the string is "+reverse(str));
		
	}

}
