package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseWordsInAGivenString {
	public static String reversewords(String str)
	{
		String[]array=str.split("\\.");
		Collections.reverse(Arrays.asList(array));
		String Rev_str=String.join(".",Arrays.asList(array));
		return Rev_str;
	}
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=obj.next();
		System.out.println(reversewords(str));
		
	}

}
