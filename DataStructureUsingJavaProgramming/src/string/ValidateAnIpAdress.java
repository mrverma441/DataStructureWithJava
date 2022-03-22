package string;

import java.util.HashSet;
import java.util.Scanner;

public class ValidateAnIpAdress {
	public static boolean isvalidip(String s)
	{
		int count=0;
		for(char ch:s.toCharArray())
		{
			if(ch=='.')
			{
				count++;
			}
		}
		if(count!=3)
		{
			return false;
		}
		HashSet<String>set=new HashSet<>();
		for(int i=0;i<256;i++)
		{
			set.add(String.valueOf(i));
			
		}
		String []array=s.split("\\.");
		int count1=0;
		for(String str:array)
		{
			if(set.contains(str))
			{
				count1++;
			}
		}
		if(count1==4)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter an Ip Address to check it is valid or not ");
		String s=obj.next();
		System.out.println(isvalidip(s));
	}

}
