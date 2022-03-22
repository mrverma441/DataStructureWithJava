package bitmanipulation;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		//Get Method
//		int n=5;
//		int pos=3;
//		int bitMask=1<<pos;
//		if((bitMask&n)==0)
//		{
//			System.out.println("Bit was zero");
//		}
//		else
//		{
//			System.out.println("Bit was one");
//		}
		//Set Method
		
//		int n=5;
//		int pos=1;
//		int bitMask=1<<pos;
//		System.out.println(bitMask|n);

		//Clear Method
//		int n=5;
//		int pos=2;
//		int bitMask=1<<pos;
//		int nbitMask=(~bitMask);
//		int newnum=nbitMask&n;
//		System.out.println(newnum);
		
		//Update Method for 0==clear
		//update Method for 1==set
		Scanner obj=new Scanner(System.in);
		int oper=obj.nextInt();
				
		int n=5;
		int pos=1;
		int bitMask=1<<pos;
		if(oper==1)
		{
			int newnum=bitMask|n;
			System.out.println(newnum);
		}
		else
		{
			int newbitmask=~(bitMask);
			int newnum=newbitmask&n;
			System.out.println(newnum);
			
		}
		
		
		
		
		
		
	}

}
