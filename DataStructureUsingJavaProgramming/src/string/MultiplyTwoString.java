package string;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyTwoString {
	public static String multiplyoftwostring(String s1,String s2)
	{
		BigInteger num1=new BigInteger(s1);
		BigInteger num2=new BigInteger(s2);
		BigInteger mul_res=num1.multiply(num2);
		return mul_res.toString();

	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=obj.next();
		System.out.println("Enter the second string");
		String str2=obj.next();
		System.out.println("Multiply of two string is "+multiplyoftwostring(str1,str2));
		

	}

}
