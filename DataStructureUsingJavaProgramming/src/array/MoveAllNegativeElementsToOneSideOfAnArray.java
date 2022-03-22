package array;
import java.util.Scanner;
public class MoveAllNegativeElementsToOneSideOfAnArray {
	public static void Move(int[]array,int size)
	{
		int j=0;
		for(int i=0;i<size;i++)
		{
			if(array[i]<0)
			{
				if(i!=j)
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			    j++;
			}
		}
	}
	public static void printarray(int[]array,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=obj.nextInt();
		System.out.println("Enter the elements of the array");
		int[]array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=obj.nextInt();
		}
		Move(array,size);
		printarray(array,size);
	}
}
