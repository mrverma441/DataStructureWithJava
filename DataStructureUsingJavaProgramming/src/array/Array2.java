package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		String[] names=new String[size];
		for(int i=0;i<size;i++)
		{
			names[i]=obj.next();
		}
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		

	}

}
