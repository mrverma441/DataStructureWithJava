package stringbuilder;

import java.util.Scanner;

public class ReverseAStringUsingStringBuilder {
	public static StringBuilder reverse(String str)
	{
		StringBuilder rev=new StringBuilder(str).reverse();
		return rev;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String to find its reverse");
		String str=obj.nextLine();
		StringBuilder str2=reverse(str);
		System.out.println("Reverse of the string is "+str2);
		
		
		

	}

}
