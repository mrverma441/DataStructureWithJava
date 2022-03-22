package array;

import java.util.Scanner;

public class LuckyNumber {

	public static void luckynumber(int n)
	{
		StringBuffer obj1=new StringBuffer();
		for(int i=1;i<=n;i++)
		{
			obj1.append(i+",");
		}
		System.out.println(obj1.toString());
		int removeposition=2;
		String elementsarray[]=obj1.toString().split(",");
		while(removeposition<elementsarray.length)
		{
			obj1=new StringBuffer();
			for(int i=0,j=1;i<elementsarray.length;i++,j++)
			{
				if(j==removeposition)
				{
					j=0;
				}
				else
				{
					obj1.append(elementsarray[i]+",");
				}
				System.out.println(obj1.toString());
				elementsarray=obj1.toString().split(",");
				removeposition++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n<1)
		{
			System.out.println("Please Enter a Valid Number");
		}
		else
		{
			luckynumber(n);
		}

	}

}
