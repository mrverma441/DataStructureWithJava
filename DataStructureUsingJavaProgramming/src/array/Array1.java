package array;
import java.util.Scanner;


public class Array1 {

	String str;

	public static void main(String[] args) {
//		int[]marks2=new int[5];
//		Scanner obj=new Scanner(System.in);
//		marks[0]=85;
//		marks[1]=90;
//		marks[2]=95;
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println("Enter the marks for marks2 array");
//		for(int i=0;i<marks2.length;i++)
//		{
//			marks2[i]=obj.nextInt();
//		}
//		for(int i=0;i<marks2.length;i++)
//		{
//			System.out.println(marks2[i]);
//		}
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of the array");
		
		int size=obj.nextInt();
		int[] marks=new int[size];
		for(int i=0;i<size;i++)

		{
			marks[i]=obj.nextInt();
			
					
		}
		System.out.println("Enter the number to find in array");
		int x=obj.nextInt();
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==x)
			{
				System.out.println("x is present at index "+i);

			}
		}
		
	}

}
